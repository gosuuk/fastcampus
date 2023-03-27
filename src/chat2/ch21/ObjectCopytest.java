package src.chat2.ch21;

public class ObjectCopytest {
    public static void main(String[] args) {

        Book[] libray = new Book[5];
        Book[] copyLibary = new Book[5];


        libray[0] = new Book("태백산맥1", "조정래");
        libray[1] = new Book("태백산맥2", "조정래");
        libray[2] = new Book("태백산맥3", "조정래");
        libray[3] = new Book("태백산맥4", "조정래");
        libray[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(libray, 0, copyLibary, 0, 5);
        System.out.println("==library==");
        for (Book book : libray) {
            System.out.println(book);
            book.ShowInfo();
        }
        System.out.println("== copy library==");
        for (Book book : copyLibary) {
            System.out.println(book);
            book.ShowInfo();
        }
    }
}
