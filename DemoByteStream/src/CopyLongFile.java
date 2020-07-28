import java.io.*;
public class CopyLongFile {
    private static final int BUFFER_SIZE = 4096; // 4KB

    public static void main(String[] args) {
//        if (args.length < 2) {
//            System.out.println("Please provide input and output files");
//            System.exit(0);
//        }

        String inputFile = "test.txt";
        String outputFile = "test2.txt";


        try (
                InputStream inputStream = new FileInputStream(inputFile);
                OutputStream outputStream = new FileOutputStream(outputFile);
        ) {

            byte[] buffer = new byte[BUFFER_SIZE];

            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
