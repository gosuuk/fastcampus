package src.chat2.ch20;

public class ChararrayTest {

    public static void main(String[] args) {

        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i = 0; i<alphabets.length; i++) {
            alphabets[i] = ch++;
        }

        for (char alpth : alphabets) {
            System.out.println(alpth + "," + (int)alpth);
        }
    }
}
