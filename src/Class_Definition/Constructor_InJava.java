package Class_Definition;

public class Constructor_InJava {

    String name;

    //Creating Constructors in java
    //1. Default
    //2. No-Argument
    //3. Parameterized

    //This is No-Argument constructor
    public Constructor_InJava(){

        this.name = "Test Java Constructor!";
    }
    //This is Parmeterized constructor
    public Constructor_InJava(String name){
        this.name = name;
        System.out.println(name);
        System.out.println("Some code");
    }

    public static void main(String[] args) {

        Constructor_InJava obj = new Constructor_InJava();

        System.out.println(obj.name);

        Constructor_InJava objOne = new Constructor_InJava("Test");
    }
}
