package Chapter2;

import javax.swing.*;

/*Get input from the user using input dialog box from
* JOptionPane class*/
public class UserInputDialogBoxes {
    public static void main(String[] args) {
        //Declare
        String firstName;
        double height;
        float salary;
        int birthYear, age;
        final int CURRENT_YEAR = 2024;

        //Assign - get input from the user
        firstName = JOptionPane.showInputDialog("Enter name");
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));
        salary = Float.parseFloat(JOptionPane.showInputDialog("Enter Salary"));
        birthYear = Integer.parseInt(JOptionPane.showInputDialog("Enter birth year"));

        age = CURRENT_YEAR - birthYear;

        //use - display details
        JOptionPane.showMessageDialog(null,"First Name: " + firstName +
                "\nAge: " + age + "\nHeight: " + height + "\nSalary: " + salary);






    }
}
