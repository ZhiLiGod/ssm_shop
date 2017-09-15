package com.shop.mapper;

import java.util.List;

import com.shop.domain.UserCustom;

public interface UserMapperCustom {
	public UserCustom findUser(UserCustom userCustom) throws Exception;
	public Integer findUid(String username) throws Exception;
	
	public List<UserCustom> selectUserByPassword(String userName);//@Param("userName") 
}
