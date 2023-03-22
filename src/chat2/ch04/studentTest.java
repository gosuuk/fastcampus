package src.chat2.ch04;

public class studentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentId = 12345;
        studentLee.address = "서울 강북구";
        studentLee.setStudentName("Lee");

        studentLee.showStudentInfo();

        Student studentkim = new Student();
        studentkim.studentId = 45678;
        studentkim.address = "부산시 진구";
        studentkim.setStudentName("kim");

        studentkim.showStudentInfo();
        System.out.println(studentkim);
        System.out.println(studentLee);

    }
}
