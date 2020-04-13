package com.zhangjm.service;

import com.github.pagehelper.PageInfo;
import com.zhangjm.pojo.Spu;
import com.zhangjm.pojo.SpuVO;

/**
 * 
 * @author zhuzg
 *
 */
public interface SpuService {
	
	/**
	 * 
	 * @param page
	 * @param spuVo  查询条件
	 * @return
	 */
	PageInfo<Spu> list(int page,SpuVO spuVo);
	
	int add(Spu spu);
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	int deleteBatch(int ids[]);
	
	/**
	 * 
	 * @param spu
	 * @return
	 */
	int update(Spu spu);
	
	/**
	 * 
	 * @param id
	 * @param marketable 1 在售  0 未售
	 * @return
	 */
	int updateMarkable(int id,int marketable);
	
	/**
	 * 获取详情
	 * @param id
	 * @return
	 */
	Spu getById(int id);
	
	
}
