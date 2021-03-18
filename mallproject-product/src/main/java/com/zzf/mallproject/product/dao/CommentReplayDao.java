package com.zzf.mallproject.product.dao;

import com.zzf.mallproject.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-08 15:15:20
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
