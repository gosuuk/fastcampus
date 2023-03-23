package src.chat2.ch11;

public class MakeReportTest {
    public static void main(String[] args) {

        MakeRaport builder = new MakeRaport();
        String report = builder.getReport();

        System.out.println(report);
    }
}
