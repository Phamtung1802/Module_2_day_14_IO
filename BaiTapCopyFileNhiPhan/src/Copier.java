import java.io.*;
import java.util.Scanner;

public class Copier {
    private static final int BUFFER_SIZE = 4096; // 4KB

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap file can copy");
        String inputFile = scanner.nextLine();
        System.out.println(inputFile);
        System.out.println("nhap ten file dich");
        String outputFile = scanner.nextLine();
        try {
            InputStream inputStream = new FileInputStream(inputFile);
            System.out.println(inputStream);
            OutputStream outputStream = new FileOutputStream(outputFile);
            BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream)


            while (bufferedInputStream != -1) {
                outputStream.write(buffer);
            }
            System.out.println(buffer.length);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
