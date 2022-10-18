package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo
{
    public static void main(String[] args) throws IOException {
        String filename = "./src/FileHandling/welcome.txt";
        FileWriter fw = new FileWriter(filename);
        fw.write("Welcome to the coding class ");
        fw.write("\n Today we are learning Filehandling.");
        fw.append("Hello");
        fw.close();
        FileReader fr = new FileReader(filename);
        System.out.println(fr.read());
        fr.read();
        int i = fr.read();
        while(i != -1){
             i = fr.read();
            System.out.print((char) i);

        }
    }
}
