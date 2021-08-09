package com.javis.UserService.inheritance;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class MyFriends {
    public Friend[] getFriends(){
        Friend[] friends = new Friend[4];
        String[] names = {"LEE","SEO","YOON","PARK"};
        String[] majors = {"Computer","Electromics"};
        String[] departments = {"R&D 1","R&D 2"};
        String[] phones = {"010-333-555","010-222-444","02-123-999","02-321-777"};
        for(int i=0;i < friends.length; i++){
            friends[i] = (i < 2) ? new UnivFriend(names[i], majors[i], phones[i])
                    : new CompFriend(names[i], departments[i-2], phones[i]);
        }
        return friends;
    }
}

@NoArgsConstructor
@Data class Friend{
    protected String name;
    protected String phone;
    public Friend(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
}

@Data final class UnivFriend extends Friend{
    private String major;
    public UnivFriend(String name, String maj, String ph){
        super(name, ph);
        major = maj;
    }
    @Override public String toString(){
        return String.format("대학친구: %s %s %s ",name,major,phone);
    }
}

@Data final class CompFriend extends Friend{
    private String department;
    public CompFriend(String name, String dep, String ph){
        super(name, ph);
        department = dep;
    }
    @Override public String toString(){
        return String.format("직장 동료: %s %s %s ",name,department,phone);
    }

}


