package DayOne;

import java.util.Date;

public class Long_Intro {

    public static void main(String[] args) {

        long l1 = 10;

        //Wrapper class
        Long someNum = new Long(l1);
        System.out.println(someNum);
        System.out.println(l1);

        long timeInmillisecond = new Date().getTime();
        System.out.println("Time in millisecond: " + timeInmillisecond);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println("=============");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);



    }

}
