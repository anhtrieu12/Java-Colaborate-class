package Class_Definition;

public class Java_Mehod_Types {
    /*
    +Method/function in class
    + Types of Method/function in java
        1. Static vs non-static
        2. void vs non-void
        3. with parameter or without parameter
     */

    public static void main(String[] args) {
      getRefB();


      // Calling constructor in java
      Java_Mehod_Types objOne = new Java_Mehod_Types();
      objOne.getinfo();

    }

    public static void getRefA(){
        System.out.println("This is A");
    }

    public static void getRefB(){
        getRefA();

        // In order to call the non-static method in a static method,
        // we need to call the constructor
        Java_Mehod_Types obj = new Java_Mehod_Types();
        obj.getinfo();
    }

    public void getinfo(){
        System.out.println("This is non-static method");
    }

    //class constructor
    //1. it will always same name as class name.
    //2. never be static or non-static
    //3. never be void or return type
    //4. with args and without agrs
    //5. we can call the constructor in static method

    public Java_Mehod_Types(){
        System.out.println("This is constructor");

    }


}
