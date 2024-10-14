package Chapter5;
/*
* Use nested if statements when a condition depends
* on other conditions
*
* Scenario: The program should determine if the student can submit assignment 1 and assignment 2.
* This will be based on whether the student scores above 50% for their test. The student needs
* 55% and above on  assignment 1, if they do, ask them to submit assignment 2. The student needs
* 60% and above for assignment 2. If the student fails assignment 2, the program should check if they
* have at least 75% class attendance.
* */
public class Nested_If_Else {
    public static void main(String[] args) {
        double assignment1 = 58;
        double assignment2 = 48;
        double testMark = 69;
        int attendance = 78;

        if (testMark >= 50){//1

            if (assignment1 >= 55){//1.1

                if (assignment2 >= 60){//1.1.1
                    System.out.println("You have passed all the 3 assessments (A)");//A
                }else{
                    if (attendance >= 75){
                        System.out.println("Assignment 2 condoned (B)");//B
                    }else{
                        System.out.println("You have failed assignment 2 (C)");//C
                    }
                }
            }else{
                System.out.println("You failed your assignment 1. You cannot submit assignment 2 (D)");//D
            }
        }else {
            System.out.println("You failed the test, you cannot submit any assignments (E)");//E
        }

    }

}
