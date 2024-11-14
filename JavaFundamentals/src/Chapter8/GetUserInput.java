package Chapter8;

import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        int[] arNumbers = new int[5];
        Scanner sc = new Scanner(System.in);
        int count = 1;

        for (int i = 0; i <= arNumbers.length - 1 ; i++) {
            System.out.print("Enter number " + count + ": ");
            arNumbers[i] = sc.nextInt();
            count++;
        }

        //display
        for (int i = 0; i <= arNumbers.length - 1 ; i++) {
            System.out.print(arNumbers[i] + "  ");
        }
    }
}
