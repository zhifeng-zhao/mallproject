package com.zzf.mallproject.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:15:58
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

