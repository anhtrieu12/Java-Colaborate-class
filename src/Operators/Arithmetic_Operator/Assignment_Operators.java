package Operators.Arithmetic_Operator;

public class Assignment_Operators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a += 5; // a = a(1) + 5;
        b *= 4; // b = b(2) * 4;
        c -= a * b;
        c %= 6;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        //variable that allow you to hold more than one value at a time

        int numArray[] = {2,3,4,5,6,7,8};

        for(int i = 0;i < numArray.length; i++){

            //Print all elements in an array
            //System.out.println(numArray(i));

            //Only want to print even number from an array

            if(numArray[i] % 2 == 0){
                System.out.println("These are  the even number from array" + numArray[i]);
            }

            //Only print odd number

            if(numArray[i] % 2 == 1){
                System.out.println("These are the odd number from array" + numArray[i]);
            }
        }

        //Print the length of array
        System.out.println("Length of array is: " + numArray.length);

    }
}
