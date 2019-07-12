package FileIO.ReadFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileTypes {
    public static void main(String[] args) {

        String str = readLineByLine("src/FileIO/ReadFile.txt");
        System.out.println(str);
        String strOne = readAllWithReaderClass("src/FileIO/ReadFile.txt");
        System.out.println(strOne);

        String strTwo = usingBufferedClass("src/FileIO/ReadFile.txt");
        System.out.println(strTwo);

        readFileUsingByteArray("src/FileIO/ReadFile.txt");

    }

    //Read the file convert in String...

    public static String readLineByLine(String filePath) {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8);
            stream.forEach(s -> stringBuilder.append(s).append("\n"));
        } catch (IOException e) {

            System.out.println("Cannot read the file");
        }
        return stringBuilder.toString();
    }

    //File class read file
    public static String readAllWithReaderClass(String filePath) {
        String str = "";

        try {
            str = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.getMessage();
        }

        return str.toUpperCase();

    }

    //Read file using BufferReader Class

    public static String usingBufferedClass(String filePath) {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(currentLine).append("\n");
            }

        } catch (IOException e) {
            e.getMessage();
        }
        return stringBuilder.toString();
    }

    //Convert data from file into byte[] array then process it

    public static byte[] readFileUsingByteArray(String file) {

        FileInputStream inputStream = null;

        byte[] barray = new byte[file.length()];

        try {
            inputStream = new FileInputStream(file);
            inputStream.read(barray);
            inputStream.close();

            for (int i = 0; i < barray.length; i++) {
                System.out.print((char) barray[i]);
            }
        } catch (Exception e) {

        }
        return barray;

    }
}
