package ControlFlow.IF_Block.LoopsinJava.Forloop;

public class ForEach_Intro {

    //forEach loop only use for array

    public static void main(String[] args) {

        int nums[] = {4, 5, 6, 7, 4, 5, 6, 7};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "");
        }

        int nums1[] = {4, 5, 6, 7, 4, 5, 6, 7};

        for (int i : nums1) { //print out only the odd number
            if (nums1[i] % 2 == 1) {
                System.out.println(nums1[i]);
            }
        }

        //use foreach loop and only print total of all elements
        int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : numArray) {

            sum += i;
        }
        System.out.println("Total is: " + sum);

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char c : vowels) {
            System.out.println(c);
        }

       /*
       Given a string and a non-negative int n, return a larger string that is n copies of the original string

       stringTimes("Hi",2)->"HiHi"
       StringTimes("Hi",3) ->"HiHiHi"
       stringTimes("Hi",1)->"Hi"
        */

        String str = "HiHiHi";
        int n = 5;

        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        System.out.println(result);
    }

}
