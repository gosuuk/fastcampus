package src.chat5.ch09;

public class MemberArrayListTest {

    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "세종대왕");
        Member memberKim = new Member(1002, "김무무");
        Member memberPark = new Member(1003, "박무진");
        Member memberHong = new Member(1004, "홍식상");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberHong);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberPark);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberPark.getMemberId());
        memberArrayList.showAllMember();


    }
}
