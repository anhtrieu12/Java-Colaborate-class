package FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;

public class CreateFile {

    public static void main(String[] args) {

        //This will call the method createFileUsingClass() to create file "TestFilOne.txt"
        //This will call the method createFileUsingFileOutputStream() to create file "TestFileTwo.txt"
        try {
            createFileUsingClass();
            createFileUsingFileOutputStream();
            createFileUsingNIO();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void createFileUsingClass() throws IOException {

        File file = new File("TestFileOne.txt");

        //Create a file
        if (file.createNewFile()) {
            System.out.println("File has been created");
        } else {
            System.out.println("File is already exist");
        }

        //Write to the file
        FileWriter writer = new FileWriter(file);
        writer.write("File Writer class...");
        writer.close();

    }

    public static void createFileUsingFileOutputStream() throws IOException {

        String content = "This is using File input stream";

        FileOutputStream out = new FileOutputStream("TestFileTwo.txt");
        out.write(content.getBytes());
        out.close();

        FileOutputStream fileout = new FileOutputStream("Demo.txt");
        fileout.write(content.getBytes());
        fileout.close();
    }

    public static void createFileUsingNIO() throws IOException {

        String content = "Using class from NIO package";
        Files.write(Paths.get("TestFileThree.txt"), content.getBytes());

    }


}
