package src.chat5.ch12;

public class MemberTreeSetTest {

    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberKim = new Member(1003, "김기리");
        Member memberLee = new Member(1001, "이순신");
        Member memberKang = new Member(1002, "강승현");

        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.showAllMember();

    }
}

