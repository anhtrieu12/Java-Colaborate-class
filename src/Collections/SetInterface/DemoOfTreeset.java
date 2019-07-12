package Collections.SetInterface;

import Collections.MapInterface.CodeTest.Person;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoOfTreeset {

    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<>();
        integers.add(45);
        integers.add(65);
        integers.add(76);
        integers.add(23);
        System.out.println(integers);//will print out without order

        System.out.println("=== TreeSet ===");
        Set<Integer> set = new TreeSet<>(integers); //will print out with order
        System.out.println(set);


//        Set<Person> personSet = new TreeSet<>();
//        personSet.add(new Person(12,"John",new Date(),"Add"));
//        personSet.add(new Person(13,"Jack",new Date(),"Add"));
//        personSet.add(new Person(11,"Mark",new Date(),"Add"));
//        personSet.add(new Person(12,"John",new Date(),"Add"));
//
    }
}
