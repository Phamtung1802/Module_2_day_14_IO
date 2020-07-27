import java.io.*;

public class ReadCSVFile {
    File source;
    Reader reader;
    BufferedReader bufferedReader;
    Writer writer;
    String cvsSplitBy = ",";


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

    public String[] toArray() throws IOException {
        String chuoiCanTach= readRawContent();
        StringBuffer append=new StringBuffer("");

        for(int i=0; i<chuoiCanTach.length();i++){
            while(Character.toString(chuoiCanTach.charAt(i))!=cvsSplitBy){
                append.append(Character.toString(chuoiCanTach.charAt(i));
            }
        }

    }

}
