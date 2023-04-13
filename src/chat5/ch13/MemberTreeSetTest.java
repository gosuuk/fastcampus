package src.chat5.ch13;

import src.chat5.ch12.Member;
import src.chat5.ch12.MemberTreeSet;

import java.util.HashMap;

public class MemberTreeSetTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        src.chat5.ch13.Member memberKim = new src.chat5.ch13.Member(1003, "김기리");
        src.chat5.ch13.Member memberLee = new src.chat5.ch13.Member(1001, "이순신");
        src.chat5.ch13.Member memberKang = new src.chat5.ch13.Member(1002, "강승현");

        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKang);
        memberHashMap.showAllMember();
        HashMap<Integer, String > hashMap = new HashMap<Integer, String>();
        hashMap.put(1001, "kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Kang");

        System.out.println(hashMap);

    }
}

