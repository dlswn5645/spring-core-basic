package com.spring.core.basic.singleton;

import com.spring.core.basic.config.AppConfig;
import com.spring.core.basic.config.TestConfig;
import com.spring.core.basic.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너 테스트")
    void pureContainer() {

        AppConfig appConfig = new AppConfig();

        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        //주소가 다름(싱글톤이 되지 않음)
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
    }

    @Test
    @DisplayName("스프링 컨테이너를 통한 싱글톤 테스트")
    void singleContainer() {

        ApplicationContext ac
                = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService1 = ac.getBean(MemberService.class);
        MemberService memberService2 = ac.getBean(MemberService.class);

        //주소가 같음(싱글톤이 됨)
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
    }

    //싱글톤 사용시 주의점 : 공유되지 않아야할 것이 공유될 수 있음
    @Test
    void statefulTest() {

        ApplicationContext ac
                = new AnnotationConfigApplicationContext(TestConfig.class);

        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //첫번째 사용자가 statefulService1로 주문
        statefulService1.order("김철수", 10000);

        //두번째 사용자가 statefulService2로 주문
        statefulService2.order("박영희", 20000);

        //첫번째 사용자가 주문 금액 조회
        System.out.println("1번사용자 주문 금액 = " + statefulService1.getPrice());

    }
}
