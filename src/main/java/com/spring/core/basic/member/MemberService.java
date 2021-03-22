package com.spring.core.basic.member;

public interface MemberService {

    //회원 가입 요청 처리기능
    void join(Member member);

    //회원 조회 요청 처리기능
    Member findMember(Long memberId);
}
