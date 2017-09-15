package com.shop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.shop.domain.CartItemCustom;

public interface CartItemService {
	public void addToCart(CartItemCustom cartItemCustom) throws Exception;
	public CartItemCustom findByPid(Integer pid) throws Exception;
	public void updateCartItem(CartItemCustom cartItemCustom) throws Exception;
	public List<CartItemCustom> findCartByUid(Integer id) throws Exception;
	public void deleteByCid(Integer cid) throws Exception;
	
	public PageInfo<CartItemCustom> queryByPage(Integer id,Integer pageNo,Integer pageSize) throws Exception;
	public List<CartItemCustom> findCartByCid(Object[] cid)throws Exception;

}
