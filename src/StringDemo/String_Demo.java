package StringDemo;

public class String_Demo {

    public static void main(String[] args) {

        //Concat

        String str1 = "Hello";
        String str2 =  " World";

        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));


        //Hashcode method

        System.out.println(str1.hashCode());
        System.out.println("Hello".hashCode()); // will be print out the same value in both sysout


        //Contains (boolean value, will have true or false result)

        System.out.println("Java learning!!".contains("Java"));


        //compareTo()

        System.out.println("apple".compareTo("banana"));


        //compareToignoreCase()

        System.out.println("apple".compareToIgnoreCase("Apple"));


    }
}
