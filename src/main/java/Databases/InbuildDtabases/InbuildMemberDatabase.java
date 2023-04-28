package Databases.InbuildDtabases;

import Models.Interfaces.MemberInterface;
import Models.ModelIml.Member;

import java.util.ArrayList;
import java.util.List;

public class InbuildMemberDatabase {
    List<MemberInterface> MemberList;

    public InbuildMemberDatabase(){
        MemberList = new ArrayList<>();
        save(new Member(1,"Kelum"));
        save(new Member(2,"Heshan"));
        save(new Member(3,"Sanjaya"));
        save(new Member(4,"Hasitha"));
    }

    public boolean save(MemberInterface member){
        return MemberList.add(member);
    }

    public List<MemberInterface> getMemberList() {
        return MemberList;
    }

    public MemberInterface getMember(int id){
        return MemberList.stream().filter(member->member.getId()==id).findFirst().orElse(null);
    }

    public int getLastId(){
        int maxId = MemberList.stream()
                .mapToInt(MemberInterface::getId)
                .max()
                .orElse(0);

        return maxId;

    }
}
