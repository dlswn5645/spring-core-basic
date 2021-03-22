package com.spring.core.basic.order;

import com.spring.core.basic.member.Grade;
import com.spring.core.basic.member.Member;
import com.spring.core.basic.member.MemberService;
import com.spring.core.basic.member.MemberServiceImpl;

public class OrderMain {
    
    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Member member1 = new Member(1L, "김철수", Grade.BASIC);
        Member member2 = new Member(2L, "박영희", Grade.VIP);
        
        memberService.join(member1);
        memberService.join(member2);
        
        //////////////////회원 가입//////////////////////////

        Order order = orderService.createOrder(2L, "삼겹살", 20000);
        System.out.println("order = " + order);
        System.out.println("최종지불액 " + order.calculatePrice());

    }
}
