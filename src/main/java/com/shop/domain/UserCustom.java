package com.shop.domain;

import java.util.List;

public class UserCustom extends User {
	private List<OrderCustom> orderList;

	public List<OrderCustom> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderCustom> orderList) {
		this.orderList = orderList;
	}
	
}
