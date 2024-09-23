package Chapter2;

import java.util.Scanner;

/*This class focuses on accepting input from the user.
* */
public class UserInput {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String firstName;
       double height;
       float salary;
       int birthYear, age;
       final int CURRENT_YEAR = 2024;

       //Assign - get input from the user
        System.out.print("Enter first name: ");
        firstName = input.nextLine();
        System.out.print("Enter Height: ");
        height = input.nextDouble();
        System.out.print("Enter you birth year: ");
        birthYear = input.nextInt();
        System.out.print("Enter Salary: ");
        salary = input.nextFloat();

        age = CURRENT_YEAR - birthYear;

        //use
        System.out.println("----------------OUTPUT------------------------------");
        System.out.println("First Name: " + firstName +
                "\nAge: " + age + "\nHeight: " + height +
                "\nSalary: " + salary);



    }
}
