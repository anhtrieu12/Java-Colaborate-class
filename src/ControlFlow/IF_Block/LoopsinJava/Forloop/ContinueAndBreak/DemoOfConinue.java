package ControlFlow.IF_Block.LoopsinJava.Forloop.ContinueAndBreak;

public class DemoOfConinue {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {

            if (i == 4) {
                System.out.println("four");
                continue;
            }

            System.out.println(i);
        }

        for (int i = 0; i < 1000; i++) {

            if (i == 3) {
                System.out.println(i);
                break;
            }
        }
    }
}
