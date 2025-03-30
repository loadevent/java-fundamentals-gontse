package Chapter3.ClassesAndObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    //Class variables
    private String studentNo;
    private String firstname, lastname, email;
    private double test1, test2, examMark, finalMark;

    //Mutators / Setters - are used to change the value of the variable
    public void setStudentNo(String stNo){
        this.studentNo = "st-" + Utilities.getCurrentYear() + stNo;
    }

    public void setFirstname(String name){
        this.firstname = name;
    }

    public void setLastname(String lName){
        this.lastname = lName;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void setTest1(double test1){
        this.test1 = test1;
    }
    public void setTest2(double test2){
        this.test2 = test2;
    }

    public void setExamMark(double exam){
        this.examMark = exam;
    }

    //Accessor methods / getters

    public String getStudentNo(){
        return this.studentNo;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getEmail(){
        return this.email;
    }
    public double getTest1(){
        return this.test1;
    }
    public double getTest2(){
        return this.test2;
    }
    public double getExamMark(){
        return this.examMark;
    }
    public double getFinalMark(){
        this.finalMark = (test1 * 0.15) + (test2 * 0.25) + (examMark * 0.6);

        return this.finalMark;
    }

    public String displayDetails(){
        String details;

        details = "Student No: " + this.getStudentNo() +
                "\nFirstname: " + this.getFirstname() +
                "\nLastname: " + this.getLastname() +
                "\nEmail: " + this.getEmail() +
                "\n===============================" +
                "\nTest 1: " + this.getTest1() +
                "\nTest 2: " + this.getTest2() +
                "\nExam: " + this.getExamMark() +
                "\nFinal Mark: " + this.getFinalMark();

        return details;
    }

}
