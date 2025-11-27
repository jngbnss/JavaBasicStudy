package javaAdv2.io.member;

import java.util.ArrayList;
import java.util.List;
import javaAdv2.io.member.impl.MemberRepository;

//메모리에 회원을 저장하고 관리하는 구현체
public class MemoryMemberRepository implements MemberRepository {
    private final List<Member> members = new ArrayList<>();

    @Override
    public void add(Member member) {
        members.add(member);
    }

    @Override
    public List<Member> findAll() {
        return members;
    }
}
