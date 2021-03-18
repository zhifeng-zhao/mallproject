package com.zzf.mallproject.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:18:51
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

