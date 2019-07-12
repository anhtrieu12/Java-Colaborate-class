package Collections.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Author> authors = new ArrayList<>();
        authors.add(new Author("John", "Girshm", 32));
        authors.add(new Author("Mike", "Smith", 30));
        authors.add(new Author("Ban", "Fraklin", 60));


        Collections.sort(authors);
        System.out.println("===Sort by First Name===");
        for (Author au : authors) {
            System.out.println(au);
        }

        //Sort by age..
        Collections.sort(authors,new AuthorAgeComparator());
        System.out.println("===Sort by Author Age===");
        for (Author au : authors) {
            System.out.println(au);
        }

        //Sort by Last name
        Collections.sort(authors,new AuthorLastNameComrator());
        System.out.println("===Sort by Author LastName===");
        for (Author au : authors) {
            System.out.println(au);
        }


    }
}

class AuthorAgeComparator implements Comparator<Author> {


    @Override
    public int compare(Author o1, Author o2) {
        if (o1.authorAge == o2.authorAge) {
            return 0;
        } else if (o1.authorAge > o2.authorAge) {
            return 1;
        } else {
            return -1;
        }

    }
}


class AuthorLastNameComrator implements Comparator<Author>{

    @Override
    public int compare(Author o1, Author o2) {
        return o1.lastName.compareTo(o2.lastName);
    }
}