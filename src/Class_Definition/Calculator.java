package Class_Definition;


public class Calculator {

    int numOne;
    int numTwo;

    double numthree;
    double numFour;

    public Calculator(int a, int b) {
        System.out.println(a + b);
    }

    public Calculator(double a, double b) {
        System.out.println(a * b);
    }

    public Calculator(int a, double b) {
        System.out.println(a - b);
    }

    public Calculator() {
        System.out.println("This is no-arg constructor");
    }

    public static void main(String[] args) {

        Calculator objOne = new Calculator(4, 4);
        Calculator objTwo = new Calculator(4.12, 4.99);
        Calculator objThree = new Calculator(2, 2.99);
        Calculator objFour = new Calculator(2.99, 4.00);
        Calculator objFive = new Calculator();

        ClassA a = new ClassA();
        System.out.println(a);
        a.getInfoOfA();

    }
}
