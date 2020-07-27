import java.io.*;


public class DemoFile {
    File sourceFile, outputFile;
    Reader reader;
    Writer writer;

    public DemoFile(String input) throws FileNotFoundException {
        sourceFile = new File(input + ".txt");
    }

    public File getSourceFile() {
        return sourceFile;
    }

    public String getSourceFileContent() throws IOException {
        this.reader = new FileReader(this.sourceFile);
        StringBuffer fileContent = new StringBuffer("");
        int i = -1;
        while ((i = reader.read()) != -1) {
            fileContent.append((char) i);
        }
        reader.close();
        return fileContent.toString();
    }

    public String getOutputFileContent() throws IOException {
        this.reader = new FileReader(this.outputFile);
        StringBuffer fileContent = new StringBuffer("");
        int i = -1;
        while ((i = reader.read()) != -1) {
            fileContent.append((char) i);
        }
        reader.close();
        return fileContent.toString();
    }

    public void copyFileContent(String tenfile) throws IOException {
        outputFile = new File(tenfile + ".txt");
        if (!this.outputFile.exists() && !this.outputFile.isDirectory()) {
            this.writer = new FileWriter(this.outputFile);
            writer.write(this.getSourceFileContent());
            writer.close();
        } else System.out.println("File da ton tai");
    }
}
