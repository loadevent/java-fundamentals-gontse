package Chapter3;

import javax.swing.*;
import java.util.Scanner;

public class ReturnTypeMethods {
    public static void main(String[] args) {
        //variable = value
        System.out.println(getMessage());
        JOptionPane.showMessageDialog(null, getMessage());
        int sum = calculateSum();//8
        System.out.println("Sum: " + sum);

    }
    //calculate and return the sum of two integers
    public static int calculateSum(){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        //logic
        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
        //return sum;
        return num1 + num2;
    }

//    public static String getMessage(){
//        String message;
//        message = "Hi, welcome to Java Training\n" +
//                "================================\n";
//        return message;
//    }
    public static String getMessage(){
        return "Hi, welcome to Java Training\n" +
                "================================\n";
    }
}
