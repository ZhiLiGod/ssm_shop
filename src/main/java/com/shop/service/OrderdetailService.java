package com.shop.service;

import java.util.List;

import com.shop.domain.OrderdetailCustom;

public interface OrderdetailService {
	public void insertOrdersDetail(List<OrderdetailCustom> orderdetailCustom)throws Exception;
}
