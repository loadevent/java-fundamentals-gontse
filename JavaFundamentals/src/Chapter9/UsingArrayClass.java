package Chapter9;

import java.util.Arrays;

public class UsingArrayClass {
    public static void main(String[] args) {

        int[] arNumbers = new int[5];
        int[] arNumbers2 = new int[5];
        display("Original array",arNumbers);

        Arrays.fill(arNumbers,4); //fills the array with 4s
        display("After filling with 4s",arNumbers);

        arNumbers[1] = 8;
        arNumbers[3] = 6;
        arNumbers[4] = 2;
        arNumbers[0] = 12;
        display("After changing 3 values",arNumbers);

        Arrays.sort(arNumbers);
        display("After sorting",arNumbers);

        System.out.println(Arrays.compare(arNumbers,arNumbers2));

    }

    public static void display(String text, int[] ar){
        for (int num : ar){
            System.out.print(num + "  ");
        }
        System.out.println("\n=====================================");
    }
}
