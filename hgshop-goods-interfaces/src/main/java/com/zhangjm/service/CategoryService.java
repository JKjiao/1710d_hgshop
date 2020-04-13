package com.zhangjm.service;

import java.util.List;

import com.zhangjm.pojo.Category;

public interface CategoryService {

	//查
		List<Category> getTree();
		//增
		Integer add(Category category);
		//修改
		Integer update(Category category);
		//删除
		Integer delete(Integer catId);
	
}
