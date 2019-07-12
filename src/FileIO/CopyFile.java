package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            File infile = new File("src/FileIO/ReadFile.txt");
            File outfile = new File("src/FileIO/CopyOfReadFile.txt");

            inputStream = new FileInputStream(infile);
            outputStream = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];

            int lenght;
            while ((lenght = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, lenght);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File copied!!");
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
