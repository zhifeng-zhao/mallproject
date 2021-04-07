package com.zzf.mallproject.menber.feign;

import com.zzf.mallproject.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zzf
 * @date 2021/3/19 5:28 下午
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/menberCoupon")
    R getMenberCoupons ();
}
