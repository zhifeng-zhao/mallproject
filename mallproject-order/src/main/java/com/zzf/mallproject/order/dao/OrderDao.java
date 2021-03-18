package com.zzf.mallproject.order.dao;

import com.zzf.mallproject.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:15:58
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
