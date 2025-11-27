package javaAdv2.io.member.impl;

import java.util.List;
import javaAdv2.io.member.Member;

public interface MemberRepository {
    void add(Member member);
    List<Member> findAll();
}
