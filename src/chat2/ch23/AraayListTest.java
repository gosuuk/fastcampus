package src.chat2.ch23;

import src.chat2.ch21.Book;

import java.util.ArrayList;
import java.util.function.BiPredicate;

public class AraayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));
        library.add(new Book("태백산맥5", "조정래"));

        for(int i = 0; i<library.size(); i++) {
            library.get(i).ShowInfo();
        }
    }
}
