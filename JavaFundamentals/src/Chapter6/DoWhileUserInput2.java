package Chapter6;

import java.util.Scanner;
/*
* The program will give discount based on class type and spend amount
* 50 - 250 K = 8%, T = 6%, A = 3%
* */
public class DoWhileUserInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String classType;//(K, T, A)
        String userResponse;
        double spendAmount, discounted = 0;

        do {
            do {
                System.out.println("Select an option:\n" +
                        "K - Kid\nT - Teenager\nA - Adult");
                classType = sc.next();
            }while (!(classType.equalsIgnoreCase("K") || classType.equalsIgnoreCase("T") ||
                    classType.equalsIgnoreCase("A")));

            do {
                System.out.print("Enter spend amount (50 - 250): ");
                spendAmount = sc.nextDouble();

            }while (spendAmount < 50 || spendAmount > 250);

            if (classType.equalsIgnoreCase("K")){
                discounted = spendAmount - (spendAmount * 0.08);
            } else if (classType.equalsIgnoreCase("T")) {
                discounted = spendAmount - (spendAmount * 0.06);
            } else if (classType.equalsIgnoreCase("A")) {
                discounted = spendAmount - (spendAmount * 0.03);
            }

            System.out.println("Class Type: " + classType + "\nDiscounted Amount: " + discounted);

            //ask the user if they want to exit
            System.out.print("Do you want to exit? (Y/N)");
            userResponse = sc.next();
        }while (userResponse.equalsIgnoreCase("N"));



    }
}
