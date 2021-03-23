package com.spring.core.basic.config;

import com.spring.core.basic.discount.DiscountPolicy;
import com.spring.core.basic.discount.RateDiscountPolicy;
import com.spring.core.basic.member.MemberRepository;
import com.spring.core.basic.member.MemberService;
import com.spring.core.basic.member.MemberServiceImpl;
import com.spring.core.basic.member.MemoryMemberRepository;
import com.spring.core.basic.order.OrderService;
import com.spring.core.basic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//스프링은 컨테이너에 미리 주입할 빈(자바객체)들을 등록하고 주입을 해줌
//수동으로 설정을 진행할 경우 설정 클래스에 @Configuration을 붙임
@Configuration
public class AppConfig {

    //빈등록 : 메서드형태로 주입할 객체를 리턴하도록 함

    //MemberService에게 객체를 주입해주는 기능
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    //OrderService에게 객체를 주입해주는 기능
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy()
        );
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
