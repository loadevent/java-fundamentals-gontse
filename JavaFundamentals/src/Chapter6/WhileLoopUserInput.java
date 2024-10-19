package Chapter6;

import java.util.Scanner;

public class WhileLoopUserInput {
    public static void main(String[] args) {
        /*prompt the user for any number of integers, add them
        together and display their sum. The program should stop when
        the user enters zero (0)
         */
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();//5

        while (number != 0 && number > 0){
            sum = sum + number;
            System.out.print("Enter a number: ");
            number = sc.nextInt();//0
        }

        System.out.println("Sum = " + sum);
    }
}
