package Exceptions;

public class ThrowExample {

    public static void main(String[] args) {

        checkEligity(15,69);
        // checkEligity(11, 39);
    }

    static void checkEligity(int stuAge, int stuWeight) {

        if (stuAge < 12 && stuWeight < 40) {
            throw new ArithmeticException("Student is not eligible");
        } else {
            System.out.println("Student is eligible");
        }
    }

}
