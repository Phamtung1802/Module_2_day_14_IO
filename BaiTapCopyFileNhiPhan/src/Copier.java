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
<<<<<<< HEAD
<<<<<<< HEAD
        try {
            InputStream inputStream = new FileInputStream(inputFile);
            System.out.println(inputStream);
            OutputStream outputStream = new FileOutputStream(outputFile);
            BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream)
=======
=======
>>>>>>> parent of e7aa4fc... update
        try (
                InputStream inputStream = new FileInputStream(inputFile);
                OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
<<<<<<< HEAD
>>>>>>> parent of e7aa4fc... update
=======
>>>>>>> parent of e7aa4fc... update


            while (bufferedInputStream != -1) {
                outputStream.write(buffer);
            }
            System.out.println(buffer.length);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
