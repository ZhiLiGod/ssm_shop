package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.domain.OrderdetailCustom;
import com.shop.mapper.OrderDetailMapperCustom;
import com.shop.service.OrderdetailService;

public class OrderdetailServiceImpl implements OrderdetailService{

	@Autowired
	private OrderDetailMapperCustom orderDetailMapperCustom;
	
	@Override
	public void insertOrdersDetail(List<OrderdetailCustom> orderdetailCustom)
			throws Exception {
		orderDetailMapperCustom.insertOrdersDetail(orderdetailCustom);
		
	}

}
