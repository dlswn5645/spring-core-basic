package com.spring.core.basic.member;

public class MemberMain {

    public static void main(String[] args) {
        
        MemberService memberService = new MemberServiceImpl();
        
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
