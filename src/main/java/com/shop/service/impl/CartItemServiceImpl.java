package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.domain.CartItemCustom;
import com.shop.domain.UserCustom;
import com.shop.mapper.CartItemMapper;
import com.shop.service.CartItemService;

public class CartItemServiceImpl implements CartItemService {
	
	@Autowired
	private CartItemMapper cartItemMapper;
	
	@Override
	public void addToCart(CartItemCustom cartItemCustom) throws Exception {
		cartItemMapper.addToCart(cartItemCustom);
	}

	@Override
	public CartItemCustom findByPid(Integer pid) throws Exception {
		// TODO Auto-generated method stub
		return cartItemMapper.findByPid(pid);
	}

	@Override
	public void updateCartItem(CartItemCustom cartItemCustom) throws Exception {
		// TODO Auto-generated method stub
		cartItemMapper.updateCartItem(cartItemCustom);
	}

	@Override
	public List<CartItemCustom> findCartByUid(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return cartItemMapper.findCartByUid(id);
	}

	@Override
	public void deleteByCid(Integer cid) throws Exception {
		cartItemMapper.deleteByCid(cid);
		
	}

	@Override
	public PageInfo<CartItemCustom> queryByPage(Integer id, Integer pageNo,Integer pageSize) throws Exception {
	    pageNo = pageNo == null?1:pageNo;
	    pageSize = pageSize == null?10:pageSize;
	    PageHelper.startPage(pageNo, pageSize);
	    List<CartItemCustom> list = cartItemMapper.findCartByUid(id);
	    PageInfo<CartItemCustom> page = new PageInfo<CartItemCustom>(list);
	    return page;
	}

	@Override
	public List<CartItemCustom> findCartByCid(Object[] cid) throws Exception {
		// TODO Auto-generated method stub
		return cartItemMapper.findCartByCid(cid);
	}
	
}
