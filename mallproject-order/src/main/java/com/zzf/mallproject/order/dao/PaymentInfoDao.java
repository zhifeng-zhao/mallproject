package com.zzf.mallproject.order.dao;

import com.zzf.mallproject.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:15:58
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
