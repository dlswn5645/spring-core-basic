package com.spring.core.basic.config;

import com.spring.core.basic.discount.DiscountPolicy;
import com.spring.core.basic.discount.RateDiscountPolicy;
import com.spring.core.basic.member.MemberRepository;
import com.spring.core.basic.member.MemberService;
import com.spring.core.basic.member.MemberServiceImpl;
import com.spring.core.basic.member.MemoryMemberRepository;
import com.spring.core.basic.order.OrderService;
import com.spring.core.basic.order.OrderServiceImpl;

//객체를 생성해서 필요에 맞게 주입해주는 역할(책임)을 가진 클래스
public class AppConfig {

    //MemberService에게 객체를 주입해주는 기능
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    //OrderService에게 객체를 주입해주는 기능
    public OrderService orderService(){
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy()
        );
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
