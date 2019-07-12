package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Intro {

    public static void main(String[] args) {

        //List declaration
        List<String> nameList = new ArrayList<>();

        //With class declaration
        // ArrayList<String> list = new ArrayList<>();

        System.out.println(nameList);

        nameList.add("John");
        nameList.add("Sam");
        nameList.add("Josh");
        nameList.add("Mike");

        System.out.println(nameList);

        //Read the list with for loop
        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).equals("Josh")) {
                System.out.println("This is Josh");
            }
            System.out.println(nameList.get(i));
        }

        //Using iterator class
        Iterator<String> iterator = nameList.iterator();
        System.out.println("======Using Iterator class=====");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
