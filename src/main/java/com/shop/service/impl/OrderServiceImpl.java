package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.domain.OrderCustom;
import com.shop.domain.Orders;
import com.shop.domain.Page;
import com.shop.domain.UserCustom;
import com.shop.exception.CustomException;
import com.shop.mapper.OrdersMapper;
import com.shop.mapper.OrdersMapperCustom;
import com.shop.service.OrderService;

public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrdersMapper ordersMapper;
	
	@Autowired
	private OrdersMapperCustom orderMapperCustom;
	
	@Override
	public int insert(Orders record) throws Exception {
		
		return ordersMapper.insert(record);
	}

	@Override
	public Page<OrderCustom> queryOrderPage(Integer uid, Integer pageNo,
			Integer size, Integer status) throws Exception {
		Page<OrderCustom> p = new Page<OrderCustom>();
		OrderCustom o = new OrderCustom();
		o.setUserId(uid);
		o.setStatus(status);
		List<OrderCustom> orders = orderMapperCustom.findOrders(o);
		int total = orders.size();
		int totalPage = total%size==0?total/size : (total/size)+1;
		int start = 0;
		int end = 0;
		int endIndexStart = (pageNo-1)*size>orders.size()?orders.size():(pageNo-1)*size;
		int endIndexEnd = pageNo*size>orders.size()?orders.size():pageNo*size;
		if(pageNo>total){
			throw new CustomException("Wrong page number.");
		}
		for(int i = 0 ; i < endIndexStart ; i++){
			start += orders.get(i).getOrderDetailList().size();
		}
		for(int i = endIndexStart ; i < endIndexEnd ; i++){
			end += orders.get(i).getOrderDetailList().size();
		}
		
		p.setStart(start);
		p.setEnd(end);
		p.setUid(uid);
		p.setPageNo(pageNo);
		p.setTotalPage(totalPage);
		p.setTotal(total);
		p.setStartO(endIndexStart);
		p.setEndO(endIndexEnd);
		p.setStatus(status);
		List<OrderCustom> orderList = orderMapperCustom.findOrdersByUid(p);
		p.setList(orderList);
		return p;
	}

	@Override
	public int count(Integer pageNo, Integer uid) throws Exception {
		int count = 0;
		return count;
	}

	@Override
	public OrderCustom findOrderByOid(Integer oid) throws Exception {
		// TODO Auto-generated method stub
		return orderMapperCustom.findOrderByOid(oid);
	}

	@Override
	public void cancelOrderByOid(Integer oid) throws Exception {
		orderMapperCustom.cancelOrderByOid(oid);
		
	}

	@Override
	public void confirmOrderByOid(Integer oid) throws Exception {
		orderMapperCustom.confirmOrderByOid(oid);
		
	}
	
}
