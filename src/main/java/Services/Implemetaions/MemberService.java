package Services.Implemetaions;

import Models.ModelIml.Member;
import Repositories.MemberRepository;
import Services.Interfaces.MemberServiceInterface;

import java.util.List;

public class MemberService implements MemberServiceInterface {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void addMember(int id,String name) {
        Member member = new Member(id, name);
        memberRepository.addMember(member);
    }

    @Override
    public void removeMember(int memberId) {
        memberRepository.removeMember(memberId);
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.getAllMembers();
    }

    @Override
    public Member getMemberById(int memberId) {
        return memberRepository.getMemberById(memberId);
    }

}
