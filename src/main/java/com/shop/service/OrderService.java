package com.shop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.shop.domain.OrderCustom;
import com.shop.domain.Orders;
import com.shop.domain.Page;
import com.shop.domain.UserCustom;

public interface OrderService {
	public int insert(Orders record) throws Exception;
	public Page<OrderCustom> queryOrderPage(Integer uid, Integer pageNo, Integer size, Integer status) throws Exception;
	public int count(Integer pageNo, Integer uid) throws Exception;
	public OrderCustom findOrderByOid(Integer oid) throws Exception;
	public void cancelOrderByOid(Integer oid) throws Exception;
	public void confirmOrderByOid(Integer oid) throws Exception;
}
