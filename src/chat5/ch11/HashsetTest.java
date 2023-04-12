package src.chat5.ch11;

import java.util.HashSet;

public class HashsetTest {
    public static void main(String[] args) {

        HashSet<String > hashSet = new HashSet<String>();
        hashSet.add(new String("세종대왕"));
        hashSet.add(new String("이순신"));
        hashSet.add(new String("광개토대왕"));
        hashSet.add(new String("강감찬"));
        hashSet.add(new String("김구"));

        System.out.println(hashSet);
    }
}
