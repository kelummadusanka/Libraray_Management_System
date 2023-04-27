package Models.ModelIml;

import Models.Interfaces.MemberInterface;

public class Member implements MemberInterface {
    private  int Id;
    private String Name;

    public Member(int id,String name){
        this.Id = id;
        this.Name = name;
    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public void setId(int id) {
        Id = id;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }
}
