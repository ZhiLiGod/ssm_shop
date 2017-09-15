package com.shop.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.domain.ItemCustom;
import com.shop.domain.Items;
import com.shop.mapper.ItemsMapper;
import com.shop.mapper.ItemsMapperCustom;
import com.shop.service.ItemsService;
@Transactional
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Override
	public Items selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return itemsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ItemCustom> findNewComing() throws Exception {
		List<ItemCustom> list = itemsMapperCustom.findNewComing();
		int length = list.size();
		for(int i = 0 ; i < length ; i++){
			Date date=new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK).parse(list.get(i).getCreatetime().toString());
			SimpleDateFormat sdf=new SimpleDateFormat("dd MMM. yyyy");
			String sDate=sdf.format(date);
			list.get(i).setReleasedDate(sDate);
		}
		return list;
	}

	@Override
	public ItemCustom findItemById(Integer id) throws Exception {
		return itemsMapperCustom.findItemById(id);
	}

	@Override
	public PageInfo<ItemCustom> queryByPage(ItemCustom itemCustom, Integer pageNo,
			Integer pageSize) throws Exception {
		pageNo = pageNo == null ? 1:pageNo;
		pageSize = pageSize == null ? 10:pageSize;
		PageHelper.startPage(pageNo, pageSize);
		List<ItemCustom> list = itemsMapperCustom.searchItemByKeyword(itemCustom);
		PageInfo<ItemCustom> page = new PageInfo<ItemCustom>(list);
		return page;
	}

}
