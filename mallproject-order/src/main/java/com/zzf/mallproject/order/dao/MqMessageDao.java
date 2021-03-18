package com.zzf.mallproject.order.dao;

import com.zzf.mallproject.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:15:58
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
