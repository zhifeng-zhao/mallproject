package com.zzf.mallproject.product.dao;

import com.zzf.mallproject.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-08 15:15:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
