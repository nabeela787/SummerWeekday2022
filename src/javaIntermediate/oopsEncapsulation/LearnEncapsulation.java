package javaIntermediate.oopsEncapsulation;

public class LearnEncapsulation {

    String studentName = "Luc";
    String studentID = "12345";
    private String employeeID = "123ABC";
    private int salary = 65000;

    String getEmployeeID() {
        return this.employeeID;
    }

    void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    int getSalary() {
        return this.salary;
    }
    void setSalary(int salary) {
        this.salary = salary;
    }

}
