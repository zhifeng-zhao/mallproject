package com.zzf.mallproject.menber.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zzf.mallproject.menber.entity.MemberLevelEntity;
import com.zzf.mallproject.menber.service.MemberLevelService;
import com.zzf.mallproject.common.utils.PageUtils;
import com.zzf.mallproject.common.utils.R;



/**
 * 会员等级
 *
 * @author zzf
 * @email @gmail.com
 * @date 2021-03-18 11:12:15
 */
@RestController
@RequestMapping("menber/memberlevel")
public class MemberLevelController {
    @Autowired
    private MemberLevelService memberLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("menber:memberlevel:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberLevelService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("menber:memberlevel:info")
    public R info(@PathVariable("id") Long id){
		MemberLevelEntity memberLevel = memberLevelService.getById(id);

        return R.ok().put("memberLevel", memberLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("menber:memberlevel:save")
    public R save(@RequestBody MemberLevelEntity memberLevel){
		memberLevelService.save(memberLevel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("menber:memberlevel:update")
    public R update(@RequestBody MemberLevelEntity memberLevel){
		memberLevelService.updateById(memberLevel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("menber:memberlevel:delete")
    public R delete(@RequestBody Long[] ids){
		memberLevelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
