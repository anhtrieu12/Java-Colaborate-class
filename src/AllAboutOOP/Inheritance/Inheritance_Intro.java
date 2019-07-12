package AllAboutOOP.Inheritance;



public class Inheritance_Intro extends A{

    double d1;

    public static void main(String[] args) {

        Inheritance_Intro intro = new Inheritance_Intro();
        intro.id = 15;
        intro.sum = 55;
        intro.total = 95;
        intro.sumOfall(4, 6, 8);
        intro.d1 = 4.99;

        A a = new A();
        a.id = 15;
        a.sum = 45;
        a.total = 95;
        a.sumOfall(5,7,9);

        int n = Inheritance_Intro.numOne;
        int a1 = A.numOne;
    }


}
class A {
    int id;
    int sum;
    int total;

    static int numOne;

    public final void sumOfall(int a, int b, int c) {
        this.id = a;
        this.sum = b;
        this.total = c;

        System.out.println(a + b + c);
    }
}



