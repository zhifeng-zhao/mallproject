package com.zzf.mallproject.menber.dao;

import com.zzf.mallproject.menber.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:12:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
