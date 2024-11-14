package Chapter8;

public class ManipulateArrays {
    public static void main(String[] args) {
        int[] arNumbers = {15, 82, 147, 23, 21, 102, 46, 99, 68, 38, 66};
        String[] arNames = {"James", "Kate", "Caroline", "Kabelo", "Dave", "Gontse", "Tsholofelo", "Thabo", "Steve", "Leon", "Jessica", "David"};
        double[] arPrices = {10.00, 20.50, 35.70, 14.29, 65.99};
        //evenNumbers(arNumbers);
        //multiplesOfThree(arNumbers);
        shortNames(arNames);
        //priceIncrease(arPrices);
    }

    public static void priceIncrease(double[] arPrices){

        System.out.println("Old Price\tNew Price\n====================================\n");
        for (int i = 0; i <= arPrices.length - 1 ; i++) {
            System.out.println(arPrices[i] + "\t\t" + (arPrices[i] + (arPrices[i] * 0.05)));
        }
    }
    public static void evenNumbers(int[] arNumbers){
        // % - modulus operator: used to get a remainder from a division
        // 8 % 2 = 0
        // 15, 82, 147, 23, 21, 102, 46, 99, 68, 38, 66
        // 0   1    2   3   4    5   6   7   8   9   10 - index
        // 1   2    3   4   5    6   7   8   9   10  11 - length
        for (int i = 0; i < arNumbers.length; i++){
            if (arNumbers[i] % 2 == 0){//check if a number is divisible by 2
                System.out.print(arNumbers[i] + "  ");
            }
        }
    }
    public static void multiplesOfThree(int[] arNumbers){

        for (int i = 0; i <= arNumbers.length - 1; i++){
            if (arNumbers[i] % 3 == 0){//check if a number is divisible by 2
                System.out.print(arNumbers[i] + "  ");
            }
        }
    }

    public static void shortNames(String[] arNames){

        //display only the names that have 5 or less characters
        for (int i = 0; i <= arNames.length - 1 ; i++) {

            if (arNames[i].length() <= 5){
                System.out.println(arNames[i]);
            }
        }
    }

}
