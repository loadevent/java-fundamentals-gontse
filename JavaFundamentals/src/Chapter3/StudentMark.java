package Chapter3;

import java.util.Scanner;

//Create an app that will calculate student final mark
/*
semester mark = assignment * 30%, test1 * 33%, test2 * 37%
final mark = semester + exam mark / 2
 */
public class StudentMark {
    //Declaring variables at a global level
    static double assignment, test1, test2, exam;
    static double semesterMark, finalMark;
    public static void main(String[] args) {
        captureAssessments();

        semesterMark = calcSemesterMark(assignment, test1, test2);
        finalMark = calcFinalMark(semesterMark, exam);

        displayDetails();
    }

    public static void captureAssessments(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Assignment 1 Mark: ");
        assignment = sc.nextDouble();
        System.out.print("Enter Test 1 Mark: ");
        test1 = sc.nextDouble();
        System.out.print("Enter Test 2 Mark: ");
        test2 = sc.nextDouble();
        System.out.print("Enter Exam Mark: ");
        exam = sc.nextDouble();
    }
    public static double calcSemesterMark(double assignment, double test1, double test2){
        double semesterMark;
        //semester mark = assignment * 30%, test1 * 33%, test2 * 37%
        semesterMark = (assignment * 0.3) + (test1 * 0.33) + (test2 * 0.37);
        return  Math.round(semesterMark)  ;
    }

    public static double calcFinalMark(double semesterMark, double examMark){
        double finalMark;
        //final mark = semester + exam mark / 2
        finalMark = (semesterMark + examMark) / 2;
        return Math.round(finalMark);
    }
    public static void displayDetails(){
        System.out.println("---------------OUTPUT----------------------");
        System.out.println("Assignment: " + assignment);
        System.out.println("Test 1: " + test1);
        System.out.println("Test 2: " + test2);
        System.out.println("Semester Mark: " + semesterMark);
        System.out.println("Exam Mark: " + exam);
        System.out.println("Final Mark: " + finalMark);
        System.out.println("Results: " + determineResults(finalMark));
    }

    public static String determineResults(double finalMark) {
        String results = "none";

        if (finalMark >= 90) {
            results = "Outstanding";
        } else if (finalMark >= 75) {
            results = "Excellent";
        } else if (finalMark >= 65) {
            results = "Good";
        }

        return results;
    }
}
