package Chapter3;

import javax.swing.*;
import java.util.Scanner;

public class ParameterizedMethods {
    public static void main(String[] args) {
        displayMessage("Welcome to Java Training");
        Scanner sc = new Scanner(System.in);
        double number1, number2;
        //System.out.print("Enter Number 1: ");
        //number1 = sc.nextDouble();
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Number 1"));
        //System.out.print("Enter Number 2: ");
        //number2 = sc.nextDouble();
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Number 2"));

        System.out.println("Sum: " + calculateSum(number1,number2));

    }
    //display a welcome message
    public static void displayMessage(String msg){
        System.out.println(msg);
    }
    //calculate and return the sum of two numbers
    public static double calculateSum(double num1, double num2){
        return num1 + num2;
    }
}
