package src.chat2.ch06;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.showStudenInfo());

        Student studentKim = new Student(123456, "kim", 3);
        System.out.println(studentKim.showStudenInfo());
    }
}
