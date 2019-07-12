package Collections.ComparableAndComparator;

import java.util.Comparator;

public class Author implements Comparable<Author> {
    String firstName;
    String lastName;
    int authorAge;

    public Author(String firstName, String lastName, int authorAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.authorAge = authorAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", authorAge=" + authorAge +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        return this.firstName.compareTo(o.firstName);
    }
}