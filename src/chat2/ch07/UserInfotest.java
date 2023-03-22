package src.chat2.ch07;

public class UserInfoTest {

    public static void main(String[] args) {

        UserInfo userLee = new UserInfo();
        userLee.userId = "123456";
        userLee.userPassWord = "tjddnr12345";
        userLee.userName = "park";
        userLee.phoneNumber = "01034556666";
        userLee.userAddress = "Busan, Korea";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("tjddnr123", "123456", "park");
        System.out.println(userKim.showUserInfo());
    }
}
