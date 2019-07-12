package codeTest;

/*
/*
        Return the sum of the numbers in the array, returning 0 for an empty array.
        Except the number 13 is very unlucky,
        so it does not count and numbers that come immediately after a 13 also do not count.


        sum13([1, 2, 2, 1]) → 6
        sum13([1, 1]) → 2
        sum13([1, 2, 2, 1, 13]) → 6

     */
public class ArrayCodeTest {

    public static void main(String[] args) {
        int n[] = {13, 0, 13};
        sum13(n);

        int arr[]={2, 3, 2, 2, 4, 2};
        System.out.println(sum28(arr));

    }

    public static int sum13(int[] nums) {

        int sum = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == 13) {
                i += 2;
            } else {
                sum += nums[i];
                i++;
            }


        }
        System.out.println(sum);
        return sum;
    }

    /*
    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


    sum28([2, 3, 2, 2, 4, 2]) → true
    sum28([2, 3, 2, 2, 4, 2, 2]) → false
    sum28([1, 2, 3, 4]) → false

     */

    public static boolean sum28(int[] num) {

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 2) {
                sum += num[i];
            }
        }
        return sum == 8;
    }

}
