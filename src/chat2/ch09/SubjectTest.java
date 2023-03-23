package src.chat2.ch09;

public class SubjectTest {

    public static void main(String[] args) {

        Student studentPark = new Student(100, "park");
        studentPark.setKoreaSubject("국어", 100);
        studentPark.setMathSubject("수학", 99);
        Student studentKim = new Student(200, "park");
        studentKim.setKoreaSubject("국어", 60);
        studentKim.setMathSubject("수학", 80);

        studentPark.showSocreInfo();
        studentKim.showSocreInfo();
    }
}
