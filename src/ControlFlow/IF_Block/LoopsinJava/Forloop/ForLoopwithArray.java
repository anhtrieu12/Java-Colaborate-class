package ControlFlow.IF_Block.LoopsinJava.Forloop;

public class ForLoopwithArray {

    public static void main(String[] args) {

        //Array can hold more than one value at time
        //Array always starts index zero

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr.length);
        System.out.println(arr[2]); // This will print out the number in the index 2, it will print out "3".

        int[] arrOne = new int[3]; //This will assign the size of the array, it can hold three values.
        System.out.println(arrOne[0]);

        arrOne[0] = 4;
        arrOne[1] = 7;
        arrOne[2] = 9;

        System.out.println(arrOne[0]);

        int arrTwo[] = {2, 11, 45, 9};

        for (int i = 0; i < arrTwo.length; i++) {
            System.out.println(arrTwo[i]);
        }
    }
}
