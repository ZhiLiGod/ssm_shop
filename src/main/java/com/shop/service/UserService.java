package com.shop.service;

import com.github.pagehelper.PageInfo;
import com.shop.domain.User;
import com.shop.domain.UserCustom;

public interface UserService {
	public int insert(User record);
	public UserCustom findUser(UserCustom userCustom) throws Exception;
	public Integer findUid(String username) throws Exception;
	
	
	PageInfo<UserCustom> queryByPage(String password,Integer pageNo,Integer pageSize);
}
