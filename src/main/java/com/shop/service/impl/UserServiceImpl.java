package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.domain.User;
import com.shop.domain.UserCustom;
import com.shop.mapper.UserMapper;
import com.shop.mapper.UserMapperCustom;
import com.shop.service.UserService;

@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserMapperCustom userMapperCustom;
	
	@Override
	public int insert(User record) {
		
		return userMapper.insert(record);
	}

	@Override
	public UserCustom findUser(UserCustom userCustom) throws Exception {
		
		return userMapperCustom.findUser(userCustom);
	}

	@Override
	public Integer findUid(String username) throws Exception {
		// TODO Auto-generated method stub
		return userMapperCustom.findUid(username);
	}
	
	/*
	 * 分页测试方法
	 * @see com.shop.service.UserService#queryByPage(java.lang.String, java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public PageInfo<UserCustom> queryByPage(String password, Integer pageNo,Integer pageSize) {
	    pageNo = pageNo == null?1:pageNo;
	    pageSize = pageSize == null?10:pageSize;
	    PageHelper.startPage(pageNo, pageSize);
	    List<UserCustom> list = userMapperCustom.selectUserByPassword(password);
	    //用PageInfo对结果进行包装
	    PageInfo<UserCustom> page = new PageInfo<UserCustom>(list);
	    //测试PageInfo全部属性
	    System.out.println(page.getPageNum());
	    System.out.println(page.getPageSize());
	    System.out.println(page.getStartRow());
	    System.out.println(page.getEndRow());
	    System.out.println(page.getTotal());
	    System.out.println(page.getPages());
	    System.out.println(page.getFirstPage());
	    System.out.println(page.getLastPage());
	    System.out.println(page.isHasPreviousPage());
	    System.out.println(page.isHasNextPage());
	    return page;
	}
	
}
