package com.shop.mapper;

import java.util.List;

import com.shop.domain.ItemCustom;

public interface ItemsMapperCustom {
	public List<ItemCustom> findNewComing() throws Exception;
	
	public ItemCustom findItemById(Integer id) throws Exception;
	
	public List<ItemCustom> searchItemByKeyword(ItemCustom itemCustom) throws Exception;
}
