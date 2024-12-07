package Chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListWithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arTests = new ArrayList<Integer>(Arrays.asList(
                89, 25, 84, 74, 96, 53, 68, 43, 91, 80
        ));

        int testMark;

        System.out.print("Please enter a test mark. Enter zero to exit: ");
        testMark = sc.nextInt();

        while (testMark != 0){
            arTests.add(testMark);
            System.out.print("Please enter a test mark. Enter zero to exit: ");
            testMark = sc.nextInt();
        }

        System.out.println("\nAll the test marks");
        System.out.println(arTests);

        for (int i = 0; i < arTests.size(); i++) {
            if (arTests.get(i) < 50){
                arTests.remove(arTests.get(i));
            }
        }

        System.out.println("Test Marks greater than 50");
        for (int i = 0; i < arTests.size(); i++) {
            System.out.print(arTests.get(i) + "    ");
        }
        //arTests.removeIf(test -> (test < 50));
        //System.out.println(arTests);
        System.out.println("\nThe size of the array list: " + arTests.size());



    }
}
