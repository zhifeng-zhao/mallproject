package com.zzf.mallproject.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-08 15:15:20
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

