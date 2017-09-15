package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.shop.domain.Cart;
import com.shop.domain.CartItemCustom;
import com.shop.domain.ItemCustom;
import com.shop.service.CartItemService;
import com.shop.service.ItemsService;
import com.shop.service.UserService;

@Controller
public class CartController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping("/addToCart/{pageNo}")
	public String addToCart(Model model, Integer id, Integer quantity, HttpSession session, @PathVariable("pageNo") Integer pageNo) throws Exception{
		String username = (String) session.getAttribute("username");
		CartItemCustom cartItem = new CartItemCustom();
		CartItemCustom _cartItem = cartItemService.findByPid(id);
		Cart cart = new Cart();
		float subtotal = 0;	
		if(username != null && username != ""){
			int uid = userService.findUid(username);
			if(_cartItem != null){
				int _quantity = _cartItem.getQuantity();
				_quantity += quantity;
				_cartItem.setQuantity(_quantity);
				cartItemService.updateCartItem(_cartItem);
			}else{		
				cartItem.setPid(id);
				cartItem.setUid(uid);
				cartItem.setQuantity(quantity);
				cartItemService.addToCart(cartItem);		
			}
			PageInfo<CartItemCustom> page = cartItemService.queryByPage(uid, pageNo, 80);
			List<CartItemCustom> clist = page.getList();
			for(int i = 0 ; i < clist.size() ; i++){
				subtotal += clist.get(i).getQuantity() * clist.get(i).getItems().getPrice();
			}
			cart.setSubtotal(subtotal);
			cart.setClist(clist);
			cart.setCount(clist.size());
			cart.setPage(page);
			model.addAttribute("cart", cart);
		}
		return "cart/cartItem";
	}
	
	
	@RequestMapping("/myCart/{pageNo}")
	public String myCart(Model model, HttpSession session, @PathVariable("pageNo") Integer pageNo) throws Exception{
		String username = (String) session.getAttribute("username");
		int uid = userService.findUid(username);
		Cart cart = new Cart();
		float subtotal = 0;	
		PageInfo<CartItemCustom> page = cartItemService.queryByPage(uid, pageNo, 80);
		List<CartItemCustom> clist = page.getList();
		for(int i = 0 ; i < clist.size() ; i++){
			subtotal += clist.get(i).getQuantity() * clist.get(i).getItems().getPrice();
		}
		cart.setSubtotal(subtotal);
		cart.setClist(clist);
		cart.setCount(clist.size());
		cart.setPage(page);
		model.addAttribute("cart", cart);
		return "cart/cartItem";
	}
	
	@RequestMapping("deleteCartItem/{id}")
	public String deleteCartItem(@PathVariable("id") Integer id) throws Exception{
		cartItemService.deleteByCid(id);
		return "redirect:/myCart";
	}
	
	
}
