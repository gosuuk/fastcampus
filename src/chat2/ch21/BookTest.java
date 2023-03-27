package src.chat2.ch21;

public class BookTest {

    public static void main(String[] args) {

        Book[] libray = new Book[5];

        for(int i=0; i<libray.length; i++) {
            System.out.println(libray[i]);
        }

        libray[0] = new Book("태백산맥1", "조정래");
        libray[1] = new Book("태백산맥2", "조정래");
        libray[2] = new Book("태백산맥3", "조정래");
        libray[3] = new Book("태백산맥4", "조정래");
        libray[4] = new Book("태백산맥5", "조정래");

        for(Book book : libray) {
            System.out.println(book);
            book.ShowInfo();
        }
    }
}
