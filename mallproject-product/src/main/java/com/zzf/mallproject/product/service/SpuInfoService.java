package com.zzf.mallproject.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-08 15:15:20
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

