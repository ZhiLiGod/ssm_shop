package com.shop.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.shop.domain.CartItemCustom;
import com.shop.domain.OrderCustom;
import com.shop.domain.OrderdetailCustom;
import com.shop.domain.Page;
import com.shop.domain.UserCustom;
import com.shop.service.CartItemService;
import com.shop.service.OrderService;
import com.shop.service.OrderdetailService;
import com.shop.service.UserService;



@Controller
public class OrderController {
	@Autowired
	private CartItemService cartService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderdetailService orderdetailService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/preOrder")
	public String preOrder(@RequestParam("checkboxBtn") String[] cid, HttpSession session)throws Exception{
		Integer[] c = new Integer[cid.length];
		for(int i = 0 ; i < cid.length ; i++){
			c[i] = Integer.parseInt(cid[i]);
		}
		
		List<CartItemCustom> list = cartService.findCartByCid(c);
		session.setAttribute("clist", list);
		return "order/preOrder";
	}
	
	
	@RequestMapping("/order")
	public String order(Model model, OrderCustom order, HttpSession session)throws Exception{
		 
		 List<CartItemCustom> list = (List<CartItemCustom>) session.getAttribute("clist");
		 List<OrderdetailCustom> olist = new ArrayList<OrderdetailCustom>();
		 int userid = list.get(0).getUid();
		 Integer[] cid = new Integer[list.size()];
		 float total = 0;
		 for(int i = 0 ; i < list.size() ; i++){
			 total += list.get(i).getTotal();
			 cid[i] = list.get(i).getCid();
		 }
		 OrderCustom newOrder = new OrderCustom();
		 BeanUtils.copyProperties(order, newOrder);
		 newOrder.setCreatetime(new Date());
		 newOrder.setNumber(UUID.randomUUID().toString().replaceAll("\\-", ""));
		 newOrder.setStatus(1);
		 newOrder.setTotal(total);
		 newOrder.setUserId(userid);
		 orderService.insert(newOrder);
		 cartService.deleteByCidArray(cid);
		 int oid = newOrder.getId();
		 OrderdetailCustom orderDetail = null;
		 for(int i = 0 ; i < list.size() ; i++){
			 orderDetail = new OrderdetailCustom();
			 orderDetail.setItemsId(list.get(i).getPid());
			 orderDetail.setItemsNum(list.get(i).getQuantity());
			 orderDetail.setOrdersId(oid);
			 orderDetail.setSubtotal(list.get(i).getQuantity() * list.get(i).getItems().getPrice());
			 System.out.println(list.get(i).getQuantity() * list.get(i).getItems().getPrice());
			 olist.add(orderDetail);
		 }
		 model.addAttribute("o", newOrder);
		 orderdetailService.insertOrdersDetail(olist);
		 return "order/order";
	}
	
	@RequestMapping("/myOrder/{status}/{pageNo}")
	public String myOrder(Model model, @PathVariable("pageNo") Integer pageNo, HttpSession session, @PathVariable("status") String status) throws Exception{
		int user_id = userService.findUid(session.getAttribute("username").toString());
		int _status = 0;
		System.out.println(status);
		if(status.equals("All")){
			_status = 0;
		}else if(status.equals("Deliveried")){
			_status = 4;
		}else if(status.equals("Cancelled")){
			_status = 3;
		}

		Page<OrderCustom> page = orderService.queryOrderPage(user_id, pageNo, 5, _status);
		model.addAttribute("page", page);
		return "order/myOrder";
		
		//return "";
	}
	
	@RequestMapping("/pay/{oid}")
	public String pay(Model model, @PathVariable("oid") Integer id) throws Exception{
		OrderCustom order = orderService.findOrderByOid(id);
		System.out.println(order + "hahahaha");
		System.out.println(order.getOrderDetailList().size());
		model.addAttribute("o", order);
		return "order/order";
	}
	
	@RequestMapping("/cancel/{oid}")
	public String cancel(@PathVariable("oid") Integer id) throws Exception{
		orderService.cancelOrderByOid(id);
		return "redirect:/myOrder/All/1";
	}
	
	@RequestMapping("/confirm/{oid}")
	public String confirm(@PathVariable("oid") Integer id) throws Exception{
		orderService.confirmOrderByOid(id);
		return "redirect:/myOrder/All/1";
	}
}
