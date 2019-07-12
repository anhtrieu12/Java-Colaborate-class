package FileIO;

import java.io.File;
import java.io.IOException;

public class HiddenFileExample {

    public static void main(String[] args) throws IOException, InterruptedException {

        String strFilePath = "C:/dir_1/data.txt";
        File file = new File(strFilePath);

        /*
         * Use exec method of Runtime to invoke attrib DOS command
         * and set hidden attribute of the file.
         */
        Process p = Runtime.getRuntime().exec("attrib +H " + strFilePath);

        //wait for the command to complete
        p.waitFor();

        if (file.isHidden()) System.out.println("File is hidden");
        else System.out.println("File is visible");

    }

}
