package com.zzf.mallproject.coupon.dao;

import com.zzf.mallproject.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-17 21:03:37
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
