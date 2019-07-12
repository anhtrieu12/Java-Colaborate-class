package Operators.Instanceof_Operators;

public class instanceof_Keywork {
    /*
    The instanceof keyword can be used to test if an object is of a specified type.
    if (objectReference instanceof type)
     */

    public static void main(String[] args) {

        String s = "Hello";
        if(s instanceof java.lang.String){
            System.out.println("is a String");
        }

        //However, applying instanceof on a null reference variable return false.
        // for example, the following if statement return false.

        String o = null;
        if(o instanceof java.lang.String){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
