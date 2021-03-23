package com.spring.core.basic.discount;

import com.spring.core.basic.member.Grade;
import com.spring.core.basic.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class RateDiscountPolicyTest {

    //테스트 대상 객체
    RateDiscountPolicy rd = new RateDiscountPolicy();

    //테스트 메서드
    //테스트 메서드 하나당 별개의 단위로 테스트된다.
    @Test
    @DisplayName("VIP고객은 금액의 20%가 할인되어야 한다.")
    void vip_discount_ok() {
        //given : 테스트할 데이터를 제공
        Member member = new Member(1L, "김철수", Grade.VIP);
        //when : 테스트 상황을 만든다
        int discount = rd.discount(member, 10000);

        //then : 테스트 기대상황을 확인
        System.out.println(discount == 2000);
        //나는 discount가 2000과 같다고 단언한다.
        assertThat(discount).isEqualTo(2000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 되면 안된다.")
    void vip_not_discount() {
        //given
        Member member = new Member(2L, "박영희", Grade.BASIC);
        //when
        int discount = rd.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(0);
    }
}
