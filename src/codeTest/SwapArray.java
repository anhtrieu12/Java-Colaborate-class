package codeTest;

import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {

        int a[] = {8, 6, 7, 9, 5};
        swapEnds(a);

        int b[] = {5, 2, 3};
        maxTriple(a);

    }

    /*
    Given an array of ints, swap the first and last elements in the array.
    Return the modified array. The array length will be at least 1.

    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    swapEnds([1, 2, 3]) → [3, 2, 1]
    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

    public static int[] swapEnds(int[] nums) {
        //variable will have same value as array first element
        int temp = nums[0];

        nums[0] = nums[nums.length - 1];

        nums[nums.length - 1] = temp;
        System.out.println(Arrays.toString(nums));
        return nums;

    }

    /*

Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
     */

    public static int maxTriple(int[] nums) {
        int max = nums[0];

        if (max < nums[nums.length / 2])
            max = nums[nums.length / 2];

            if (max < nums[nums.length - 1]) max = nums[nums.length - 1];

            System.out.println(max);
            return max;

        }


        /*
            Given an array of ints, return true if every element is a 1 or a 4.


        only14([1, 4, 1, 4]) → true
        only14([1, 4, 2, 4]) → false
        only14([1, 1]) → true

Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
         */

//        public static boolean verify1(int[] nums){
//
//            for (int i=0; i< nums.length;i++){
//                boolean isFound;
//
//                if (nums[i]==1 || nums[i]==4){
//                    isFound = true;
//                    System.out.println(isFound);
//                }
//                else {
//                    isFound = false;
//                    System.out.println(isFound);
//                }
//
//            }
//
//        }

}




