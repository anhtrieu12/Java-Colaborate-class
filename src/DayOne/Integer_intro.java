package DayOne;

public class Integer_intro {
    public static void main(String[] args) {

        //Wrapper class
        System.out.println(Integer.SIZE);
        System.out.println();


        for(int i = 0; i <= 16; i++){
            System.out.println(i);

        }

        int a = 100;
        int b = 150;
        int c = 20;

        if (b > a){
            a = b;
        }
        if (c > a){
            a = c;
        }
        System.out.println(a);

    }
}
