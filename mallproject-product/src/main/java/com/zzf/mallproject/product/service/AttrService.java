package com.zzf.mallproject.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-08 15:15:20
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

