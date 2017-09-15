package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.shop.domain.ItemCustom;
import com.shop.service.ItemsService;

@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping("/findItemsById/{id}")
	public String findItemsById(Model model, @PathVariable("id")Integer id) throws Exception{
		ItemCustom item = itemsService.findItemById(id);
		model.addAttribute("item", item);
		return "item/itemDetail";
	}
	
	@RequestMapping("/searchItem/{pageNo}")
	public String searchItemByKeyword(Model model, String search, @PathVariable("pageNo") Integer pageNo) throws Exception{
		ItemCustom item = new ItemCustom();
		item.setName(search);
		PageInfo<ItemCustom> page = itemsService.queryByPage(item, pageNo, 20);
		//List<ItemCustom> list = page.getList();
		model.addAttribute("plist", page);
		return "item/itemList";
	}
	
	
}
