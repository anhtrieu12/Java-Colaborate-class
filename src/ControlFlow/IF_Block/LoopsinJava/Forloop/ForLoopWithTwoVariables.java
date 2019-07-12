package ControlFlow.IF_Block.LoopsinJava.Forloop;

public class ForLoopWithTwoVariables {

    public static void main(String[] args) {

        int limit = 10;
        int sum = 0;

        for (int i = 1, j = 0; i <= limit; i++, j++) {
            System.out.println("i: " + i);
            System.out.println("j: " + j);
            sum += i + j;

            System.out.println(sum);
        }
        System.out.println(sum);

        //how to decreases the loop counter
        for (int k = 10; k > 1; k--) {
            System.out.println("Value of k: " + k);
        }
    }
}
