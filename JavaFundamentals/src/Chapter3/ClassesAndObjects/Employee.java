package Chapter3.ClassesAndObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String employeeId, firstname, lastname, email, department;
    private double basicSalary;
    private final double TAX = 0.15;

    //overloaded constructor
    public Employee(String theId, String theFName, String theLName,
                    String theEmail, String theDepartment, double salary){
        this.employeeId = theId;
        this.firstname = theFName;
        this.lastname = theLName;
        this.email = theEmail;
        this.department = theDepartment;
        this.basicSalary = salary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = "EM-" + Utilities.getCurrentYear() +  employeeId;
    }

//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
    public void setFullname(String fName, String lName){
        this.firstname = fName;
        this.lastname = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getEmployeeId() {return employeeId;}
    public String getFullname(){
        return firstname + " " + lastname;
    }

//    public String getFirstname() {return firstname;}
//
//    public String getLastname() {return lastname;}

    public String getEmail() {return email;}

    public String getDepartment() {return department;}

    public double getBasicSalary() {return basicSalary;}

    private double calcTax(){
        return getBasicSalary() * TAX;
    }
    private double calcNetSalary(){
        return getBasicSalary() - calcTax();
    }



    public String displayDetails(){
        return "Employee [" + getEmployeeId() + "] " + this.getFullname() +
                "\nEmail: " + getEmail() +
                "\nDepartment: " +getDepartment() +
                "\n=====Salary Breakdown=====" +
                "\nBasic: " + getBasicSalary() +
                "\nTax Deduction: " + calcTax() +
                "\nNet: " + calcNetSalary();
    }
}
