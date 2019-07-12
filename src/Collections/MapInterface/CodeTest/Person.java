package Collections.MapInterface.CodeTest;

import java.util.Date;

public class Person {
//       1. Create POJO class Person
//            Person - ID(Long), Name, Date(Date class), Address
//
//         2. Create with HashMap and user Person class as value..
//            1.Add the data by calling constructor of person class
//                    2.Remove
//                    3.Clone
//                    4.ContainKey
//                    5.Loop using key/ value pair

    private long personID;
    private String name;
    private Date PersondDOB;
    private String address;

    public Person() {
    }

    public Person(long personID, String name, Date persondDOB, String address) {
        this.personID = personID;
        this.name = name;
        PersondDOB = persondDOB;
        this.address = address;


    }

    public long getPersonID() {
        return personID;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPersondDOB() {
        return PersondDOB;
    }

    public void setPersondDOB(Date persondDOB) {
        PersondDOB = persondDOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;


    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", name='" + name + '\'' +
                ", PersondDOB=" + PersondDOB +
                ", address='" + address + '\'' +
                '}';
    }
}
