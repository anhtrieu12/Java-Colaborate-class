package Operators.Logical_Operators;

import java.util.Random;

public class Logical_with_If {

    public static void main(String[] args) {

        Random random = new Random();

        //And
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        if(a ==0 && b == 1){
            System.out.println("here");
        }
        else{
            System.out.println("there");
        }
        // && vs &
        int value = 8;
        int count = 10;
        int limit = 11;

        if(++value % 2 == 0 & ++count < limit){
            System.out.println("here");
            System.out.println(value);
            System.out.println(count);
        }
        System.out.println("there");
        System.out.println(value);
        System.out.println(count);


        //Or
        // the logical OR, ||,
        // Omits the evaluation of the right-hand operand when the left-hand operand is true

        if(++value % 2 == 0 | ++count < limit){
            System.out.println("here");
            System.out.println(value);
            System.out.println(count);
        }
        System.out.println("there");
        System.out.println(value);
        System.out.println(count);

        //boolean not equals to

        int i = random.nextInt(10);
        if(!(i == 0)){
            System.out.println("i is not 0");
        }
        else{
            System.out.println("i is 0");
        }

    }
}
