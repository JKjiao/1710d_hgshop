package com.zhangjm.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhangjm.pojo.Brand;
import com.zhangjm.service.BrandService;

@Controller
@RequestMapping("brand")
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,Model model,Brand brand,
					   @RequestParam(defaultValue = "1")Integer pageNum) {
		PageInfo<Brand> info = brandService.list(pageNum);
		System.out.println(info);
		//request.setAttribute("info", info);
		model.addAttribute("info", info);
		model.addAttribute("brand", brand);
		return "brand/list";
	}

	@GetMapping("toUpdateBrand")
	public String toUpdateBrand(Integer id, Model model) {
		Brand brand = brandService.toUpdateBrand(id);
		model.addAttribute("brand", brand);
		return "brand/update";
	}
	
	@PostMapping("doUpdateBrand")
	@ResponseBody
	public int doUpdateBrand(Brand brand) {
		return brandService.doUpdateBrand(brand);
	}
	
}
