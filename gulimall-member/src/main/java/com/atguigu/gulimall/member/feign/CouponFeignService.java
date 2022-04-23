package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangYM
 * @create 2022-04-21 0:02
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

        @RequestMapping("/coupon/coupon/member/list")
        R memberCoupons();
}
