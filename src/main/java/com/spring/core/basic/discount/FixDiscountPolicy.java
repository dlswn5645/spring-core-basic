package com.spring.core.basic.discount;

import com.spring.core.basic.member.Grade;
import com.spring.core.basic.member.Member;

//정액 할인 정책 구현체
//역할: VIP 회원에게만 고정된 금액을 매번 할인해서 계산액을 알려줌
public class FixDiscountPolicy implements DiscountPolicy{

    //고정 할인액
    private int discountFixAmount = 1000; //1000월 할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
