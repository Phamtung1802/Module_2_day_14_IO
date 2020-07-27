import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        DemoFile demo=new DemoFile("Input");
        System.out.println(demo.sourceFile);
        demo.copyFileContent("Output");
        System.out.println(demo.getOutputFileContent());
    }
}
