package com.shop.domain;

public class CartItemCustom extends CartItem {
	
	private ItemCustom items;
	private float total;
	
	

	public float getTotal() {
		return super.getQuantity() * this.items.getPrice();
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public ItemCustom getItems() {
		return items;
	}

	public void setItems(ItemCustom items) {
		this.items = items;
	}
	
	
	
	
}
