package src.chat6.ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("고구려");
        sList.add("백제");
        sList.add("신라");

        Stream<String> stream = sList.stream();
        stream.forEach(s->System.out.print(s));

        sList.stream().sorted().forEach(s->System.out.print(s+ "\t"));
        System.out.println();
        sList.stream().map(s->s.length()).forEach(n->System.out.println(n+ "\t"));
        System.out.println();
        sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));

    }

}

