package ControlFlow.IF_Block;

import java.util.Scanner;

public class Multiple_IFs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        System.out.println("Value of a: " + a);

        if (a == 1) {
            System.out.println("One");
        } else if (a == 2) {
            System.out.println("Two");
        } else if (a == 3) {
            System.out.println("Three");
        } else if (a == 4) {
            System.out.println("four");
        } else {
            System.out.println("not valid number!");
        }
    }
}
