package src.chat6.ch09;

public class AutoCloseableObj implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("closing");
    }
}
