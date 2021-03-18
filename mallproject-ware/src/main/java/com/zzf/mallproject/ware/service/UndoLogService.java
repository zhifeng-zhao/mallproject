package com.zzf.mallproject.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:18:51
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

