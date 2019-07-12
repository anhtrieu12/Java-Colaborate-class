package Exceptions;

public class NestedException {

    public static void main(String[] args) {

        try {
            //second try block
            try {
                int arr[]= {1,2,3,4,};
                System.out.println(arr[10]);
            }catch (ArithmeticException e){
                System.out.println("Arithmetic Exception");
                System.out.println("In the second try catch block");
            }
        }catch (ArithmeticException e){
            System.out.println("Arithemetic Exception");
            System.out.println("In Main try-block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("In Main try-block");
        }catch (Exception e){
            System.out.println("Something went wrong");
            System.out.println("In main try-block");
        }
    }
}
