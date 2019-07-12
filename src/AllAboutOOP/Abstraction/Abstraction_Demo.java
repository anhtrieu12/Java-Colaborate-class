package AllAboutOOP.Abstraction;

public class Abstraction_Demo extends Demotest{

    @Override
    void myMethod() {
        System.out.println("this is override method");
    }

    public static void main(String[] args) {
        Abstraction_Demo demo = new Abstraction_Demo();
        demo.myMethod();
    }
}

//An abstract class has no use until unless it is extended by some other class
//if you declare an abstract method in a class then you must declare the class abstract as well.
//you cannot have abstract method in a concrete class.
// it is vice versa is not always true; if a class is not having any abstract method
//then also it can be marked as abstract.
//it can have non-abstract method.
//abstract method has no body
//always end the declaration with a semicolon(;).
//It must be overridden.
//an abstract class must be extended in an same way abstract method ..look in slack!


abstract class Demotest{
    //you cannot create an instance of an abstract class
    //can have method also can have abstract method
    //all abstract methods are public
    //all abstract method ust be override by child class
    //you are not allow to have body of method for abstract method

    abstract void myMethod();

}