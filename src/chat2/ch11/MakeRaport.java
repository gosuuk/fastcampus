package src.chat2.ch11;

public class MakeRaport {

    StringBuffer buffer = new StringBuffer();

    private String line = "==============================\n";
    private String title = "  이름\t   주소 \t\t  전화번호  \n";
    private void makeHeader()
    {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody()
    {
        buffer.append("Park \t");
        buffer.append("Busan Korea \t");
        buffer.append("010-1111-2222\n");

        buffer.append("Kim \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-8888\n");
    }

    private void makeFooter()
    {

        buffer.append(line);
    }

    public String getReport()
    {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}

