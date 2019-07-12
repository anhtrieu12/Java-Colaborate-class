package ControlFlow.IF_Block.LoopsinJava.Forloop.WhileLoop;

public class WhileLoop_Intro {

    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        while (i <= 4) {
            System.out.println(i);

            i++; //break condition
        }

        //print the value of n in reverse order
        int n = 10;
        while (n > 0) {
            System.out.println(n);
            n--;
        }

        int j = 0;
        while (j < 3) {

            java.awt.Toolkit.getDefaultToolkit().beep();
            Thread.sleep(500);
            j++;
        }

    }
}
