import java.io.*;
import java.util.Scanner;

public class Copier {
    private static final int BUFFER_SIZE = 4096; // 4KB

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap file can copy");
        String inputFile = "test.txt";//scanner.nextLine();
        System.out.println("nhap ten file dich");
        String outputFile = "test2.txt";//scanner.nextLine();
        try {
            InputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
            BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);

            int buffer;
            while ((buffer=bufferedInputStream.read()) != -1) {
                System.out.println(buffer);
                bufferedOutputStream.write(buffer);
            }
            bufferedOutputStream.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}