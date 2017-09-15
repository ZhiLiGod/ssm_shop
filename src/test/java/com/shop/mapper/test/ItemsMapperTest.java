package com.shop.mapper.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.domain.Items;
import com.shop.mapper.ItemsMapper;

public class ItemsMapperTest {
	private ApplicationContext applicationContext;

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
	}
	
	@Test
	public void testSelectByPrimaryKey() {
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
		Items item = itemsMapper.selectByPrimaryKey(1);
		System.out.println(item.getName());
	}

}
