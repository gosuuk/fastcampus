package src.chat2.ch08;

import src.chat2.ch07.UserInfo;

public class Maletest {
    public static void main(String[] args) {

        Male male = new Male();
        male.name = "Tomas";
        Male.age = "37";
        Male.height = "180";
        Male.weight = "78";

        System.out.println(male.showUserInfo());
    }
}
