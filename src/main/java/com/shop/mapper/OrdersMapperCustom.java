package com.shop.mapper;

import com.shop.domain.OrderCustom;
import com.shop.domain.Orders;
import com.shop.domain.OrdersExample;
import com.shop.domain.Page;
import com.shop.domain.UserCustom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapperCustom {
	public List<OrderCustom> findOrdersByUid(Page page) throws Exception;
	public List<OrderCustom> findOrders(OrderCustom orderCustom) throws Exception;
	public OrderCustom findOrderByOid(Integer oid) throws Exception;
	public void cancelOrderByOid(Integer oid) throws Exception;
	public void confirmOrderByOid(Integer oid) throws Exception;
}