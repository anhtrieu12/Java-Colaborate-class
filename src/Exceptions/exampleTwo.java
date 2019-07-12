package Exceptions;

import java.util.Arrays;

public class exampleTwo {

    public static void main(String[] args) {

        try {
            int arr[]=new int[7];
            arr[4]= 30;
            System.out.println(Arrays.toString(arr));
            arr[5]= 23/0; //Divided by zero
            arr[50]= 23/1; // Index outside  the range of the array
            System.out.println("In Try block");//This will print when there is no error get catch
        }catch (ArithmeticException e){
            System.out.println("Warming: Arithmetic Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Outside of an Array");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Outside of the try catch block");
    }
}
