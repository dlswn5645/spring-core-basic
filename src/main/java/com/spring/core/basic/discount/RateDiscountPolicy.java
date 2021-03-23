package com.spring.core.basic.discount;

import com.spring.core.basic.member.Member;
import static com.spring.core.basic.member.Grade.VIP;

//정율 할인 정책
public class RateDiscountPolicy implements DiscountPolicy{

    //할인율
    private double discountPercent = 0.2;//할인율 20%

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == VIP){
            return (int)(price * discountPercent);
        } else {
            return 0;
        }
    }
}
