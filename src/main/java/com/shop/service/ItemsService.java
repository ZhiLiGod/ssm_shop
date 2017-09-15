package com.shop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.shop.domain.CartItemCustom;
import com.shop.domain.ItemCustom;
import com.shop.domain.Items;

public interface ItemsService {
	public Items selectByPrimaryKey(Integer id);
	public List<ItemCustom> findNewComing() throws Exception;
	public ItemCustom findItemById(Integer id) throws Exception;
	public PageInfo<ItemCustom> queryByPage(ItemCustom itemCustom,Integer pageNo,Integer pageSize) throws Exception;
}
