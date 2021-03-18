package com.zzf.mallproject.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:15:58
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

