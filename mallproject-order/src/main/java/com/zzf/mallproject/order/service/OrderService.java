package com.zzf.mallproject.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:15:58
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

