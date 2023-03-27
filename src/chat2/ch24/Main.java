package src.chat2.ch24;

public class Main {
    public static void main(String[] args) {
        Student lee = new Student(1001);
        lee.addSubject("국어", 100);
        lee.addSubject("수학", 50);
        lee.printScore();

        Student kim = new Student(1002);
        kim.addSubject("국어", 70);
        kim.addSubject("수학", 85);
        kim.addSubject("영어", 100);
        kim.printScore();
    }
}
