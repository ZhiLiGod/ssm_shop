package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.domain.CartItemCustom;
import com.shop.service.CartItemService;



@Controller
public class OrderController {
	@Autowired
	private CartItemService cartService;
	
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
}
