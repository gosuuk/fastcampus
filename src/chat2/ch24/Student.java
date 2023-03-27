package src.chat2.ch24;

import java.util.ArrayList;
class Student {
    private int id;
    private ArrayList<Subject> subjects;

    public Student(int id) {
        this.id = id;
        subjects = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        subjects.add(new Subject(name, score));
    }

    public int getTotalScore() {
        int totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }
        return totalScore;
    }

    public void printScore() {
        System.out.println("Student " + id + "'s scores:");
        for (Subject subject : subjects) {
            System.out.println(subject.getName() + ": " + subject.getScore());
        }
        System.out.println("Total score: " + getTotalScore() + "\n");
    }
}
