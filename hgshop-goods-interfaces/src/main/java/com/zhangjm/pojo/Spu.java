package com.zhangjm.pojo;

import java.io.Serializable;

public class Spu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 主键 **/
	private Integer id;
	/** SPU名 **/
	private String goods_name;
	/** 是否上架 **/
	private String is_marketable;
	/** 品牌 **/
	private Integer brand_id;
	/** 副标题 **/
	private String caption;
	/** 一级类目 **/
	private Integer category_id;
	/** 小图 **/
	private String small_pic;
	/** 品牌 **/
	private Brand brand;
	/** 分类 **/
	private Category category;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getIs_marketable() {
		return is_marketable;
	}
	public void setIs_marketable(String is_marketable) {
		this.is_marketable = is_marketable;
	}
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public String getSmall_pic() {
		return small_pic;
	}
	public void setSmall_pic(String small_pic) {
		this.small_pic = small_pic;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Spu [id=" + id + ", goods_name=" + goods_name + ", is_marketable=" + is_marketable + ", brand_id="
				+ brand_id + ", caption=" + caption + ", category_id=" + category_id + ", small_pic=" + small_pic
				+ ", brand=" + brand + ", category=" + category + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goods_name == null) ? 0 : goods_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spu other = (Spu) obj;
		if (goods_name == null) {
			if (other.goods_name != null)
				return false;
		} else if (!goods_name.equals(other.goods_name))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
