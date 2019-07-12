package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CommonExceptionClasses {

    public static void main(String[] args) {

        //IO Exception = INPUT/OUTPUT

        //1. File not found
        try {
            new FileReader(new File("Test.text"));
        }catch (FileNotFoundException e){
            System.out.println("File not found!!");
        }

        //URL website address not found
        try {
            new URL("htp://yahoo.com");
        }catch (MalformedURLException e){
            System.out.println("URL is not correctly define");
        }

        //Parse exception
        try {
            new SimpleDateFormat("MM,dd,yyyy").parse("Invalid-date");
        }catch (ParseException e){
            System.out.println("Date format is not readable");
        }

        //Thread Interrupted Exception
        try {
            Thread.sleep(3L);
        }catch (InterruptedException e){
            System.out.println("Thread exception");
        }

        //String index out of bound
        String str="Hello World";
        try {
            System.out.println(str.charAt(50));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index out of bound exception");
        }

        //NumberFormat
        String s="10ABC";
        try {
            int x = Integer.parseInt(s);
            System.out.println(x);
        }catch (NumberFormatException e){
            System.out.println("This is number format exception");
        }

        //Illegal Argument
        try {
            Thread.sleep(-100);

            //we can have more than one catch at a time

        }catch (IllegalArgumentException | InterruptedException e){
            System.out.println("This is Illegal Argument exception");
        }

    }
}
