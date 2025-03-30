package Chapter9;

import java.util.Arrays;

public class CreatingTwoDArrays {
    public static void main(String[] args) {

        String[] stNames = new String[500];

        int[][] studentMarks = new int[3][4];
        stNames[0] = "Mike";
        studentMarks[0][0] = 65;
        studentMarks[0][1] = 85;
       studentMarks[0][2] = 74;
       studentMarks[0][3] = 83;
        //student 2
        stNames[1] = "Jessica";
        studentMarks[1][0] = 74;
        studentMarks[1][1] = 36;
       studentMarks[1][2] = 75;
       studentMarks[1][3] = 85;
        //student3
        stNames[2] = "Thabo";
        studentMarks[2][0] = 12;
        studentMarks[2][1] = 55;
       studentMarks[2][2] = 76;
       studentMarks[2][3] = 96;

        //student3
        stNames[2] = "Thabo";
        studentMarks[2][0] = 12;
        studentMarks[2][1] = 55;
        studentMarks[2][2] = 76;
        studentMarks[2][3] = 96;



        for (int row = 0; row < studentMarks.length; row++){
            System.out.println(stNames[row]);
            for (int col = 0; col < studentMarks[row].length; col++){
                System.out.println("Test " + (col + 1) + ": " + studentMarks[row][col]);
            }
            System.out.println("======================");
        }


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
        //usingArrayLoop();
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
