package Chapter8;

import java.util.Scanner;

public class ParallelArraysUserInput {
    public static void main(String[] args) {
        final int SIZE = 4;
        String[] arProducts = new String[SIZE];
        double[] arPrices = new double[SIZE];
        Scanner sc = new Scanner(System.in);
        String product;
        double price;

        for (int i = 0; i <= arProducts.length - 1 ; i++) {
            System.out.print("Enter Product " + (i + 1) + ": ");
            product = sc.next();
            arProducts[i] = product;

            System.out.print("Enter price for " + product + ": ");
            price = sc.nextDouble();
            arPrices[i] = price;
        }

        //display
        System.out.println("=================OUTPUT===================");
        for (int j = 0; j <= arProducts.length - 1; j++) {
            System.out.println(arProducts[j] + "\t" + arPrices[j]);
        }


    }
}
