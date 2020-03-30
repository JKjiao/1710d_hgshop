package com.zhangjm.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhangjm.service.BrandService;

//@Controller
@RequestMapping("brand")
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,
					   @RequestParam(defaultValue = "1")Integer pageNum) {
		
		return "brand/list";
	}
}
