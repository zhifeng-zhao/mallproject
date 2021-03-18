package com.zzf.mallproject.menber.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.menber.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:12:15
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

