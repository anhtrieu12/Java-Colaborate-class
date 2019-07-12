package Collections.MapInterface.CodeTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface {
    // 2. Create with HashMap and user Person class as value..
//            1.Add the data by calling constructor of person class
//                    2.Remove
//                    3.Clone
//                    4.ContainKey
//                    5.Loop using key/ value pair

    public static void main(String[] args) {
        Map<Integer, Person> map3= new HashMap<>();
        map3.put(1,new Person(11, "John", new Date(), "407 village dr"));
        map3.put(2,new Person(22, "Heena", new Date(), "413 village "));
        map3.put(3, new Person(33, "Sina", new Date(), "33 church st"));
        System.out.println(map3);

        //using setter
        Person p1 = new Person();
        p1.setPersonID(12);
        p1.setName("Some Name");
        p1.setPersondDOB(new Date());
        p1.setAddress("100 Main st");
        map3.put(4, p1);

        System.out.println(map3);

        //remove

        map3.remove(2);
        System.out.println("==removed 2== ");
        System.out.println(map3);

        //clone

        Map<Integer, Person> map4 = new HashMap<>(map3);
        System.out.println("==clone===");
        System.out.println(map4);

        //ContainKey

        boolean b1 = map4.containsKey(2); //checking if its there or not
        System.out.println(b1);

        //Loop using key/ value pair

        Iterator<Map.Entry<Integer,Person>> mapiterator = map4.entrySet().iterator();
        while( mapiterator.hasNext()){
            Map.Entry<Integer, Person> map6 = mapiterator.next();
            System.out.println(map6);
        }









    }

}