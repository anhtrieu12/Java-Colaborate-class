package Exceptions;

public class IntroToExceptions {

    public static void main(String[] args) {

        int numOne = 12;
        int numTwo = 0;

        // Two lines below to show that the system will come up with error
        //if we don't use try catch block
//        System.out.println(numOne/numTwo);
//        System.out.println("Test");


        try{
            System.out.println(numOne/numTwo);
        }catch (ArithmeticException e){
            System.out.println("Positive number can be divided by zero");
        }catch (Exception e){
            System.out.println("Something went wrong!");
        }

        System.out.println("Outside of Try catch block!");
        System.out.println("Test");
    }
}
