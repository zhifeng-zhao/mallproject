package com.zzf.mallproject.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:15:58
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

