package Exceptions;

public class FinallyBlock {

    /*
    try{}
    catch{}
    finally{}

    you can have try with finally or try with catch and finally

    finally block always run
    we can have try catch block inside the finally block
    and we can have finally block inside the finally block
     */

    public static void main(String[] args) {

        withFinally();

    }

    public static void withFinally() {
        try {
            int num = 120 / 0;
            System.out.println(num);
        } catch (ArithmeticException e){
            System.out.println("Exception");
        }
        finally {
            System.out.println("This is finally block");
            try {
                System.out.println("This is a try block inside a finally block!");
            }finally {
                System.out.println("THIS IS SUB FINALLY BLOCK!!");
            }
        }
    }
}
