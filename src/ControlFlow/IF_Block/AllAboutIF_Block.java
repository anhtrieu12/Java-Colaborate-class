package ControlFlow.IF_Block;

public class AllAboutIF_Block {

    public static void main(String[] args) {

        int numberOfLoginAttempts = 10;
        int numberOfMinLoginAttemps=12;
        int numberOfMaxLoginAttempts=13;

        int y=3;

        //count the number login attempts and  provide if or else condition

        if(numberOfLoginAttempts<numberOfMaxLoginAttempts||numberOfMinLoginAttemps>y){
            y++;
            System.out.println(y);
        }

    }
}
