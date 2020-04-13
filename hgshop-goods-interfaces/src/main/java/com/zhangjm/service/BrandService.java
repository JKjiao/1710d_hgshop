package com.zhangjm.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhangjm.pojo.Brand;

public interface BrandService {

	/**
	 * 根据首字母查询
	 * @param firstChar
	 * @return
	 */
	List<Brand> listByFirst(String firstChar);
	
	PageInfo<Brand> list(Integer pageNum);

	/**
	 * 
	 * @param id
	 * @return
	 */
	Brand toUpdateBrand(Integer id);
	
	/**
	 * 修改品牌
	 * @param brand
	 * @return
	 */
	int doUpdateBrand(Brand brand);
}
