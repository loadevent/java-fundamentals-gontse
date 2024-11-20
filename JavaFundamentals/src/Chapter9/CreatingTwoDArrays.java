package Chapter9;

import java.util.Arrays;

public class CreatingTwoDArrays {
    public static void main(String[] args) {
        //declare empty 2D array with 2 rows and 3 columns
        int[][] arTestMarks = new int[2][3];
       /*
       * 68	78	88
         69	74	58
        */
        //Assign
        arTestMarks[0][0] = 68;
        arTestMarks[0][1] = 78;
        arTestMarks[0][2] = 88;
        arTestMarks[1][0] = 69;
        arTestMarks[1][1] = 74;
        arTestMarks[1][2] = 58;

        //display
        //System.out.println(arTestMarks[1][2]);
        //arrayWithValues();
        //displayArrayValues();
        usingArrayLoop();
    }

    public static void arrayWithValues(){
         /*
       * 68	78	88
         69	74	58
        * 56 84 73
        */
        //                          0           1           2
        int[][] arTestScores = { {68,78,88}, {69,74,58}, {56,84,73}};

        //display
        System.out.println(arTestScores[1][1]);
    }

    public static void displayArrayValues(){
        int[][] arTestScores = {{68,78,88}, {69,74,58}, {56,84,73},
                {66,48,39}};

        //display
          /*
          0  1   2   3
       * 68	78	88 - 0 - i
         69	74	58 - 1
        * 56 84 73 - 2
        */

        for (int row = 0; row < arTestScores.length ; row++) {
            for (int col = 0; col < arTestScores[row].length; col++) {
                System.out.print(arTestScores[row][col] + "   ");
            }
            System.out.println();
        }

        System.out.println("====================================");
        System.out.println(arTestScores[2].length);//rows
    }

    public static void usingArrayLoop(){
        String[][] arFoods = {
                {"Milk", "Juice", "Soft Drink"}, //0
                {"Mango", "Banana", "Apple"}, //1
                {"Lettuce", "Carrot", "Potato"} //2
        };
//        //display
//        for (int row = 0; row < arFoods.length; row++) {
//            for (int col = 0; col < arFoods[row].length; col++) {
//                System.out.print(arFoods[row][col] + "\t");
//            }
//            System.out.println();
//        }

        for (String[] row : arFoods){
            for (String col : row){
                System.out.print(col + "\t\t");
            }
            System.out.println();
        }
    }
}
