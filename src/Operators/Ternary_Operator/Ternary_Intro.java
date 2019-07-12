package Operators.Ternary_Operator;

import java.util.Random;

public class Ternary_Intro {

    public static void main(String[] args) {

        int i, k;

        i = 10;

        Random random = new Random();

        k = (i < random.nextInt(10)) ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = (i < random.nextInt(10)) ? -i : i; //get absolute value of i
        System.out.println("Absolute value of ");
        System.out.println(i + " is " + k);

    }
}
