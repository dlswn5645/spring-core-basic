package com.spring.core.basic.member;

import java.util.HashMap;
import java.util.Map;

//메모리 저장소
public class MemoryMemberRepository implements MemberRepository{

    //데이터 저장 객체(DB대용)
    private static Map<Long,Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
