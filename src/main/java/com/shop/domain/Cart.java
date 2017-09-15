package com.shop.domain;

import java.util.List;

import com.github.pagehelper.PageInfo;

public class Cart {
	private List<CartItemCustom> clist;
	private float subtotal;
	private Integer count;
	private PageInfo<CartItemCustom> page; 
	
	
	public PageInfo<CartItemCustom> getPage() {
		return page;
	}
	public void setPage(PageInfo<CartItemCustom> page) {
		this.page = page;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public List<CartItemCustom> getClist() {
		return clist;
	}
	public void setClist(List<CartItemCustom> clist) {
		this.clist = clist;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
}
