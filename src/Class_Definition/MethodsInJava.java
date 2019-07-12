package Class_Definition;

import java.util.Arrays;

public class MethodsInJava {

    int empId;
    int empSalary;
    String empName;
    String empAddress;

    int weekHours[];

    public static void main(String[] args) {

        //Calling default constructor
        MethodsInJava obj = new MethodsInJava();

        obj.setEmpId(11);
        obj.getEmpId(11);

        int hours[] = {8, 9, 8, 9, 9};
        obj.getWeekHours(hours);
    }

    public int setEmpId(int empId) {
        this.empId = empId;
        return empId;
    }

    public int getEmpId(int empId) {
        System.out.println(empId);
        return empId;
    }

    int[] getWeekHours(int[] arr) {

        weekHours = arr;
        System.out.println(Arrays.toString(weekHours));
        return weekHours;
    }
}
