package com.zhangjm.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zhangjm.pojo.Brand;
import com.zhangjm.service.BrandService;

@Controller
@RequestMapping("brand")
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,Model model,
					   @RequestParam(defaultValue = "1")Integer pageNum) {
		PageInfo<Brand> info = brandService.list(pageNum);
		//request.setAttribute("info", info);
		model.addAttribute("info", info);
		return "brand/list";
	}
}
