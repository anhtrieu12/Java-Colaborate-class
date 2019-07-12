package FileIO;

import java.io.File;

public class DeleteTheFile {

    public static void main(String[] args) {


        try {

            //This is to create a file
            File file = new File("TobeDeleted.txt");

            if (file.createNewFile()) {
                System.out.println("File is created..");
            }
            //This to be delete a file
            if (file.delete()) {
                System.out.println("File has been deleted");
            } else {
                System.out.println("file cannot be deleted");
            }

        } catch (Exception e) {
            System.out.println("Exception");
        }


    }
}
