package com.zzf.mallproject.ware.dao;

import com.zzf.mallproject.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:18:51
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
