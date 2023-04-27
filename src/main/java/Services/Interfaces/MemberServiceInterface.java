package Services.Interfaces;

import Models.ModelIml.Member;
import java.util.List;

public interface MemberServiceInterface {
    void addMember(int memberId,String memberName);
    void removeMember(int memberId);
    List<Member> getAllMembers();
    Member getMemberById(int memberId);
}
