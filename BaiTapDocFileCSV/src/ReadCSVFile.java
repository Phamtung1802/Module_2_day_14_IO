import java.io.*;

public class ReadCSVFile {
    File source;
    Reader reader;
    BufferedReader bufferedReader;
    Writer writer;

    public ReadCSVFile (String fileName){
        source=new File(fileName+".CSV");
        if(!source.exists()){
            System.err.println("File Khong Ton Tai");
        }
    }

    public String readRawContent() throws IOException {
        String s;
        if (source.isFile()) {
            bufferedReader = new BufferedReader(new FileReader(source));
            StringBuffer buffer = new StringBuffer("");
            String row;
            while ((row = bufferedReader.readLine()) != null) {
                buffer.append(bufferedReader.readLine());
            }
            s = buffer.toString();
            bufferedReader.close();
            return s;
        }
        else return "khong tim thay file";

    }

    public String splitNumber() throws IOException {
        String s=this.readRawContent();
        s.split(",");
        return s;
    }

}
