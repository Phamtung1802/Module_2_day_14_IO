import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadCSVFile test=new ReadCSVFile("test");
        System.out.println(test.splitNumber());
    }
}
