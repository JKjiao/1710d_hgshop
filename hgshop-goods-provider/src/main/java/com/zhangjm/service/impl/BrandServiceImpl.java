package com.zhangjm.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangjm.dao.BrandDao;
import com.zhangjm.pojo.Brand;
import com.zhangjm.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandDao brandDao;
	
	@Override
	public List<Brand> listByFirst(String firstChar) {
		return brandDao.listByFirst(firstChar);
	}

	@Override
	public PageInfo<Brand> list(Integer pageNum) {
		PageHelper.startPage(pageNum, 5);
		List<Brand> list = brandDao.list();
		return new PageInfo<Brand>(list);
	}

	@Override
	public Brand toUpdateBrand(Integer id) {
		return brandDao.toUpdateBrand(id);
	}

	@Override
	public int doUpdateBrand(Brand brand) {
		return brandDao.doUpdateBrand(brand);
	}

}
