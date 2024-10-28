package Chapter3;

import javax.swing.*;
import java.util.Scanner;

public class VoidMethods {
    public static void main(String[] args) {
        //method call / invoke
        displayMessage();
        displayAddress();
        //displayFullAddress();
    }

    public static void displayAddress(){
        System.out.println("123 Penelope Street");
        System.out.println("Pretoria");
        System.out.println("Gauteng");
        System.out.println("0111");
    }
    public static void displayMessage(){
        System.out.println("Hi, welcome to Java Tutorial\n" +
                "================================\n");
    }
    public static void displayMessage2(){
        JOptionPane.showMessageDialog(null,"Hi, welcome to Java Tutorial\n" +
                "================================\n");
    }

    public static void displayFullAddress(){
        String streetName, houseNo, city, province, postalCode;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter House No: ");
        houseNo = sc.next();
        System.out.print("Enter Street Name: ");
        streetName = sc.next();
        System.out.print("Enter City: ");
        city = sc.next();
        System.out.print("Enter Province: ");
        province = sc.next();
        System.out.print("Enter Postal Code: ");
        postalCode = sc.next();

        System.out.println(houseNo + " " + streetName + " Street");
        System.out.println(city + "\n" + province + ", " + postalCode);

    }
}
