package codeTest;
/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */

public class StringTest {

    public static void main(String[] args) {

        firstHaft("HelloThere");
        firstTwo("abcdef");

    }



    public static String firstHaft(String str) {

        if (str.length() % 2 == 1) {
            return "Not valid";
        } else {
            String s = str.substring(0, str.length() / 2);
            System.out.println(s);
            return s;

        }
    }

    /*
        firstTwo("Hello") → "He"
        firstTwo("abcdefg") → "ab"
        firstTwo("ab") → "ab"
     */

    public static String firstTwo(String str){

        if (str.length()<2){
            return str;
        }
        String s= str.substring(0,2);
        System.out.println(s);
        return s;

    }


}
