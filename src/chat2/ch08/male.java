package src.chat2.ch08;

public class Male<height, weight> {
    public String name;
    public static String age;
    public static String height;
    public static String weight;

    public Male(){}
    public <age> Male(String name, String age, String height, String weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }
        public String showUserInfo() {
        return "키가 " + height + "이고, 몸무게가 " + weight + "킬로인 남성이 있습니다. 이름은 " + name + "이고 나이는 " + age
                 + "세입니다.";
    }

}
