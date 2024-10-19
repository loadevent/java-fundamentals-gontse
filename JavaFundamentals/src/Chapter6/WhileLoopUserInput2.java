package Chapter6;

import java.util.Scanner;

public class WhileLoopUserInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("Enter name: ");
        name = sc.next();

        while (name.equals("Kabelo") || name.equals("Gontse") || name.equals("Carol")){
            System.out.print("Name already taken. Please enter a different name: ");
            name = sc.next();
        }
        System.out.println("Thank you " + name);


    }
}
