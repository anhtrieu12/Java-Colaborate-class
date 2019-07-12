package DayOne.referencedatatype;

public class String_Intro {

    public static void main(String[] args) {

        String strOne = "1" +  "2";
        System.out.println(strOne);

        String strTwo = strOne + " = 4";
        System.out.println(strTwo);

        String name = "JavaClassIntro";

        int length = name.length();
        System.out.println("Name length is : " + length);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


        String s1 = "JAVA";
        String s2 = "AAAA";

        System.out.println(s1 == s2); // to check if s1 s the same with s2, result will come out with true or false


        boolean b1 = s1.equals(s2); // another way to compare s1 and s2
        System.out.println(b1);


        String str = "abcde";

        if(str.startsWith("ab")){
            System.out.println("True it's starts with ab");
        }
        else{
            System.out.println(false);
        }

        if(str.endsWith("de")){
            System.out.println("True it's end with de");
        }
        else{
            System.out.println(false);
        }

    }

}
