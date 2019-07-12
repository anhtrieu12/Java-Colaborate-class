package FileIO;

import java.io.File;
import java.io.IOException;
/*
this code is to find if a file is hidden or not
 */

public class HideTheFile {
    public static void main(String[] args) throws IOException {

        File file = new File("FileToHidden.txt");

        if (file.createNewFile()) {
            System.out.println("File has been created");
        } else {
            System.out.println("File is already eixist");
        }

        try {
            if (file.isHidden()) {
                System.out.println("File is Hidden");
            } else {
                System.out.println("Not Hidden");
            }
        } catch (SecurityException e) {
            System.out.println("Exception");
        }


    }
}
