package ControlFlow.IF_Block;

import java.util.Scanner;

public class CodeTEst {

    //1.Write a java program to get a number from the user and print whether it is positive or negative

    public static void main(String[] args) {

        testOne();
        testTwo();
        testThree();
        testFour();
    }

    static void testOne() {
        System.out.println("Please enter your number:");

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if (a >= 0) {
            System.out.println("Your number is: " + a);
            System.out.println("This is a positive number.");
        } else {
            System.out.println("Your number is: " + a);
            System.out.println("This is a negative number.");
        }
    }

    // Take three numbers from the user and print the greatest number

    static void testTwo() {
        System.out.println("Please enter 3 numbers, one at a time:");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int b = scan.nextInt();
        System.out.println("Please enter second number");
        int c = scan.nextInt();
        System.out.println("Please enter third number:");
        int d = scan.nextInt();

        //Using Ternary Operator
        int result = (b > c) ? b : (c > d) ? c : d;

        System.out.println("The largest number is:" + result);

    }

    //3. Write a java program that reads a floating-point number
    //and prints "zero" if the number is zero.
    //Otherwise, print "positive" or "negative". Add "small" if the absolute value of
    //the number is less than 1, or "large"if if exceeds 1,000,000

    static void testThree() {

        System.out.println("Please enter numbers:");

        Scanner scan = new Scanner(System.in);

        float f1 = scan.nextFloat();

        if (f1 == 0) {
            System.out.println("zero");
        } else if (f1 > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        if (f1 < 1 && f1 > 0) {
            System.out.println("small");
        }

        if (f1 > 1000000) {
            System.out.println("large");
        }

    }

    // Write a java program that compare two double number.

    static void testFour(){

        System.out.println("Please enter numbers:");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number:");
        double d1 = scan.nextDouble();
        System.out.println("Please enter second number:");
        double d2 = scan.nextDouble();

        if(d1/1000==d2/1000){
            System.out.println("Two number have the same value");
        }
        else{
            System.out.println("Two number do not have the same value!");
        }
    }
}
