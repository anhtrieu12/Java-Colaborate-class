package Collections.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        //HashMap declaration
        Map<Integer, String> map = new HashMap<>();

        //Add the data
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println(map);

        // read the specific data set
        String value = map.get(2);
        System.out.println("this is value of key :" + value);

        // remove the data
        map.remove(3);
        System.out.println("==== Remove Method ====");
        System.out.println(map);

        // how to loop HashMap

        // Loop via key only
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String valueOne = map.get(key);
            System.out.println("This is key: " + key + " and Value is: " + valueOne);
        }

        // Loop via key and value both

        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println("This is key: " + entry.getKey() + "this is value: " + entry.getValue());
        }

        /*
            1.One HashMap with k = Float type and value Long
            2.Add the data
            3.Remove one entry
            4.Loop via key and Key/Value
         */

        Map<Float, Long> numMap = new HashMap<>();


        //Add the data
        numMap.put(1.2F, 3L);
        numMap.put(3.5F, 8L);
        numMap.put(19.35F, 9L);


        // Remove the data
        numMap.remove(19.35F);
        System.out.println("==== Remove Method ====");
        System.out.println(numMap);


        // Loop via key and value both

//        Iterator<numMap.Entry<Integer, String>> entryIterator = numMap.entrySet().iterator();
//        while (entryIterator.hasNext()) {
//            numMap.Entry<Integer, String> entry = entryIterator.next();
//            System.out.println("This is key: " + entry.getKey() + "this is value: " + entry.getValue());
//        }


    }
}
