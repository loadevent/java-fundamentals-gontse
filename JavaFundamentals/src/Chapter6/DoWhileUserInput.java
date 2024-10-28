package Chapter6;

import java.util.Scanner;

/*prompt the user with menu options (1 - add ,2 - subtract, 3 - divide ,4 - multiple)
the user should enter 2 numbers and compute based on user option
 */
public class DoWhileUserInput {
    public static void main(String[] args) {

        int menuOption, number1, number2;
        double results = 0;
        String userResponse;
        Scanner sc = new Scanner(System.in);

        do {
            do {
                //create a menu
                System.out.println("Select from the menu\n" +
                        "1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");

                menuOption = sc.nextInt();//2
            }while (menuOption < 1 || menuOption > 4);

            System.out.print("Enter number 1: ");
            number1 = sc.nextInt();
            System.out.print("Enter number 2: ");
            number2 = sc.nextInt();

            if (menuOption == 1){
                results = number1 + number2;
            } else if (menuOption == 2) {
                results = number1 - number2;
            } else if (menuOption == 3) {

                while (number2 == 0){
                    System.out.print("Number 2 cannot be zero. Please provide a different number.\nEnter Number 2:");
                    number2 = sc.nextInt();
                }
                results = number1 / number2;

            } else if (menuOption == 4) {
                results = number1 * number2;
            }else{
                System.out.println("Invalid");
            }

            System.out.println("Results = " + results);



            System.out.print("Do you want to continue (y/n): ");
            userResponse = sc.next();
        }while (userResponse.equals("y"));

    }
}
