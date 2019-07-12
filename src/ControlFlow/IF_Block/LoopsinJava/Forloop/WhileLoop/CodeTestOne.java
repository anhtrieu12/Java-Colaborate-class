package ControlFlow.IF_Block.LoopsinJava.Forloop.WhileLoop;

import java.util.Random;

public class CodeTestOne {

    //Print the 10 random decimal number

    public static void main(String[] args) {

        double r = 0;

        Random random = new Random();

        while (r < 0.99){
            r = random.nextDouble();
            System.out.println(r);
        }
    }
}
