package com.zzf.mallproject.menber.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.menber.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:12:16
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

