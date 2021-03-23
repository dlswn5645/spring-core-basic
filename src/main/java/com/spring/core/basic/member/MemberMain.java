package com.spring.core.basic.member;

import com.spring.core.basic.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberMain {

    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        //스프링 컨테이너 객체 생성(스프링을 활용한 주입 기능)
        ApplicationContext appConfig = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = appConfig.getBean(MemberService.class);

        //회원가입 대상 객체 
        Member member = new Member(1L,"김철수",Grade.VIP);
        Member member2 = new Member(2L,"박영희",Grade.BASIC);


        //저장소에 실제 저장 
        memberService.join(member);
        memberService.join(member2);

        //저장소에서 객체 조회 
        Member findMember = memberService.findMember(2L);
        System.out.println("findMember = " + findMember);
    }
}
