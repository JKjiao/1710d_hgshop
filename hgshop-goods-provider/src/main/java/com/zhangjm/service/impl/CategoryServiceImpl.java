package com.zhangjm.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhangjm.dao.CategoryDao;
import com.zhangjm.pojo.Category;
import com.zhangjm.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDao categoryDao;
	
	@Override
	public List<Category> getTree() {
		return categoryDao.listByParentId(0);
	}

	@Override
	public Integer add(Category category) {
		return categoryDao.add(category);
	}

	@Override
	public Integer update(Category category) {
		return categoryDao.update(category);
	}

	@Override
	public Integer delete(Integer catId) {
		return categoryDao.delete(catId);
	}
	
	
}
