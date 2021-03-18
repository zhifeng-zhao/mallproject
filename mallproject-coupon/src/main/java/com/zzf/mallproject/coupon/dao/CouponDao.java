package com.zzf.mallproject.coupon.dao;

import com.zzf.mallproject.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-17 21:03:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
