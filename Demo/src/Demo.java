import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("simple message");
        System.err.println("error message");
        int i=System.in.read();
        System.out.println((char)i);
        try {
            FileWriter test = new FileWriter("Hello.txt");
            test.write("Hello");
            test.close();
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }
}
