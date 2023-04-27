package Repositories;

import Models.ModelIml.Member;

import java.util.List;

public interface MemberRepository {
    void addMember(Member member);
    void removeMember(int memberId);
    List<Member> getAllMembers();
    Member getMemberById(int id);
}
