package ControlFlow.IF_Block.LoopsinJava.Forloop;

public class CodeTEst {

    public static void main(String[] args) {

        /*
    Given an array of ints, return the number of 9's in the array.

    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3

     */

        int arrayCount9[] = {1, 9, 9, 3, 9};
        int count = 0;

        for (int i = 0; i < arrayCount9.length; i++) {

            if (arrayCount9[i] == 9) {
                count++;
            }
        }
        System.out.println(count);

         /*
        Given an array of ints, return true if one of the first 4 elements in the
        array is a 9. The array length may be less than 4.
        arrayFont9([1,2,9,3,4]) --> true
        arrayFont9([1,2,3,4,9]) --> false
        arrayFont9([1,2,3,4,5]) --> false
     */


        int arrayFont9[] = {1, 2, 9, 3, 6};

        if (arrayFont9.length > 4) {
            System.out.println("Skip ");

            for (int i = 0; i < arrayFont9.length - 1; i++) {
                //lenght-1 because the length of array is 5
                if (arrayFont9[i] == 9) {
                    System.out.println(true);
                }
            }


        }

        // this code will do the same with the above code,
        // the difference is this code will work with any size of the array given.
        int arraFont9a[] = {1, 2, 9, 8, 7, 4, 3, 6, 5, 10};

        if (arraFont9a[0] == 9 || arraFont9a[1] == 9 || arraFont9a[1] == 9 || arraFont9a[2] == 9 || arraFont9a[3] == 9) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
