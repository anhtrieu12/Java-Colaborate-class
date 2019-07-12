package Collections.MapInterface;

import java.util.Date;

public class Person implements Comparable<Person>{
    private long personID;
    private String personName;
    private Date personDOB;
    private String personAddress;

    public Person(){
    }

    public Person(long personID, String personName, Date personDOB, String personAddress) {
        this.personID = personID;
        this.personName = personName;
        this.personDOB = personDOB;
        this.personAddress = personAddress;
    }

    public long getPersonID() {
        return personID;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Date getPersonDOB() {
        return personDOB;
    }

    public void setPersonDOB(Date personDOB) {
        this.personDOB = personDOB;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
