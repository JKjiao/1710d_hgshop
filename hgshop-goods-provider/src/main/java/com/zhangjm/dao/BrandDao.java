package com.zhangjm.dao;

import java.util.List;

import com.zhangjm.pojo.Brand;

public interface BrandDao {

	List<Brand> listByFirst(String firstChar);
	
	List<Brand> list();

	Brand toUpdateBrand(Integer id);
	
	int doUpdateBrand(Brand brand);
}
