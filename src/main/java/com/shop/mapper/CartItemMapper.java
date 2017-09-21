package com.shop.mapper;

import java.util.List;

import com.shop.domain.CartItemCustom;

public interface CartItemMapper {
	public void addToCart(CartItemCustom cartItemCustom) throws Exception;
	public CartItemCustom findByPid(CartItemCustom cartItemCustom) throws Exception;
	public void updateCartItem(CartItemCustom cartItemCustom) throws Exception;
	public List<CartItemCustom> findCartByUid(Integer id) throws Exception;
	public void deleteByCid(Integer cid) throws Exception;
	public List<CartItemCustom> findCartByCid(Object[] cid)throws Exception;
	public void deleteByCidArray(Integer[] cid)throws Exception;
}
