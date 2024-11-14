package Chapter8;

public class CreatingArrays {
    public static void main(String[] args) {

        //evenNumbersArray("Even Number - 2 - 30");
        //numbersArray("Even Numbers");
        arrayWithInitialValues();

    }

    public static void assignValuesToArray(){
        //declare an array that will store 5 integers
        int[] arNumbers = new int[5];
        int x;

        //Assign
        // 4   15    9    32    65
        // 0    1    2     3     4   - index
        // 1    2    3     4     5   - length
        x = 5;
        arNumbers[0] = 4;
        arNumbers[1] = 15;
        arNumbers[2] = 9;
        arNumbers[3] = 32;
        arNumbers[4] = 65;

        //Use / Consume
        for (int i = 1; i <= 4; i++){
            System.out.println(arNumbers[i]);
        }
    }

    public static void numbersArray(String title){
        System.out.println("================ " + title + " ====================");
        int[] arNumbers = new int[100];
        int number = 2;
        // 2   4   6....
        // 0   1   2...    99

        for (int x = 0; x <= 16; x++){
            arNumbers[x] = number;
            number = number + 2;
        }

        //display
        for (int i = 0; i <= 16; i++){
            System.out.println(arNumbers[i]);
        }
    }

    public static void evenNumbersArray(String title){
        System.out.println("================ " + title + " ====================");
        int[] arNumbers = new int[20];
        int index = 0;

        for (int x = 2; x <= 40 ; x+=2){
           arNumbers[index] = x;
           index++;
        }

        //display
        for (int i = 0; i <= 19; i++){
            System.out.println(arNumbers[i]);
        }
    }

    public static void arrayWithInitialValues(){
        int[] arNumbers = {7,5,12,36,74,105,29};
        String[] arNames = {"James", "Caroline", "Kabelo", "Dave", "Gontse"};
        double[] arPrices = {15.59, 20.50, 35.70, 14.29, 65.99};

        System.out.println("===========Numbers===============");

        for (int x = 0; x <=6; x++){
            System.out.print(arNumbers[x] + "  ");
        }
        System.out.println("\n===========Names===============");
        for (int x= 0; x <= 4; x++){
            System.out.println(arNames[x]);
        }
        System.out.println("===========Prices===============");
        for (int x= 0; x <= 4; x++){
            System.out.println(arPrices[x]);
        }

    }


}
