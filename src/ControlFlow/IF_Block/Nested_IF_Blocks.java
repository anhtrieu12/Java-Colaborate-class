package ControlFlow.IF_Block;

import java.util.Random;

public class Nested_IF_Blocks {

    public static void main(String[] args) {

        //if within the if block

        Random random = new Random();
        int a = random.nextInt(10);
        System.out.println("Value of a: " + a);

        if (a >= 5) {
            System.out.println("In if block");
            if (a >= 7) {
                System.out.println("More than 5");
            } else {
                System.out.println("More than 5 but less than 7");
            }
        } else {
            System.out.println("In else block");
        }

        int value = random.nextInt(50);
        int count = random.nextInt(50);
        int limit = random.nextInt(50);
        System.out.println("Value: " + value);
        System.out.println("Count: " + count);
        System.out.println("Limit:" + limit);

        if (++value % 2 == 0 && ++count < limit) {
            System.out.println("In if block");
            System.out.println(value);
            System.out.println(count);
        } else {
            System.out.println("In else block");
            System.out.println(value);
            System.out.println(count);
        }
    }
}
