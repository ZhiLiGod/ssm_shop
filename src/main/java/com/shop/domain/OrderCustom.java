package com.shop.domain;

import java.util.List;

public class OrderCustom extends Orders {
	private List<OrderdetailCustom> orderDetailList;

	public List<OrderdetailCustom> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderdetailCustom> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
}
