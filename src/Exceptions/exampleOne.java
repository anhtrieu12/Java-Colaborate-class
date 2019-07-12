package Exceptions;

public class exampleOne {

    public static void main(String[] args) {

        int numOne;
        int numTwo;


        try {
            numOne = 0;
            numTwo = 62 / numOne;
            String str = "TT";
            System.out.println(str.charAt(2));
            System.out.println(numTwo);
            System.out.println("Inside try catch block");
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero");
        } catch (NullPointerException e) {
            System.out.println("Sring has null value");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index value is outside of String range");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("Outside of the try catch block");
    }
}
