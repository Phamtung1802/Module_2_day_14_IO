import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DemoFile demo=new DemoFile("Input");
        System.out.println(demo.sourceFile);
//        demo.copyFileContent("Output");
//        System.out.println(demo.getOutputFileContent());
        System.out.println(demo.getSourceFileContent());
        System.out.println(demo.getSourceFileContentBuffered());
    }
}
