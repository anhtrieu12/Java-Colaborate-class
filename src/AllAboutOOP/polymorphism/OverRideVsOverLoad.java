package AllAboutOOP.polymorphism;

public class OverRideVsOverLoad {

    public static int addNum(int a, int b){
        System.out.println(a+b);
        return  a+b;

    }
    //over load addNum method

    public static long addNum(long a,long b){
        System.out.println(a+b);
        System.out.println("this is a long");
        return a+b;

    }

    public static void main(String[] args) {
        addNum(3L, 4L);
        addNum(4,5);
//        System.out.println(10);
//        System.out.println("Text");
//        System.out.println(true);
    }
}
