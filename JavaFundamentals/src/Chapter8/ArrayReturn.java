package Chapter8;

import java.util.Scanner;

//This class teaches you how to return an array from a method
public class ArrayReturn {
    public static void main(String[] args) {

//        for (int i = 0; i <= getNumbers().length - 1  ; i++) {
//            System.out.print(getNumbers()[i] + "  ");
//        }

        String[] arStNumbers = getStNumbers(3);
        System.out.println("==============ST Numbers===============");
        for (int i = 0; i < arStNumbers.length  ; i++) {
            System.out.println(arStNumbers[i]);
        }
    }
    public static int[] getNumbers(){
        return new int[]{9,5,7,12,33};
    }

    //ST-12345
    public static String[] getStNumbers(int size){
        String stNumber;
        String[] arStNumbers = new String[size];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= size - 1 ; i++) {
            System.out.print("Enter Student Number " + (i + 1) + ": ");
            stNumber = sc.next();
            arStNumbers[i] = "ST-" + stNumber;
        }

        return arStNumbers;
    }
}
