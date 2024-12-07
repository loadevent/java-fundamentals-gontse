package Chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arTests = new ArrayList<Integer>(Arrays.asList(
                89, 25, 84, 74, 96, 53, 68, 43, 91, 80,74,53,68,74
                //0,1,  2   3   4    5   6   7   8  9
        ));
        Scanner sc = new Scanner(System.in);
        int num, pos = -1, count = 0;

        System.out.print("Please enter a number to search:");
        num = sc.nextInt();

        for (int i = 0; i < arTests.size(); i++) {
            if (num == arTests.get(i)){
                pos = i;
                count++;
            }
        }

        if (pos != -1){
            System.out.println("The last position of [" + num + "] is: " + pos);
            System.out.println(num + " appears [" + count + "] times inside the list");
        }else{
            System.out.println(num + " doesn't exist inside the list");
        }

    }
}
