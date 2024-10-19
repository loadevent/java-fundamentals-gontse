package Chapter6;

/*
* For Loop is used when the number of iterations is known
* */
/*1 - 10
 * for(int loopControlVariable = initialValue; loopControlVariable = stopCondition; increment/decrement)
 * {
 *       //statements to execute
 * }
 * */
public class ForLoop {
    public static void main(String[] args) {

        //display 'Hello World 4 times'
        //b = 5 ---- 5, 6, 7, 8

        for(int b = 1; b <= 4; b++){
            System.out.println("Hello World");
        }
        System.out.println("------------2----------------");
        //display 'Monday' 7 times
        //x = 13 --- 13, 12, 11, 10, 9, 8, 7
        for(int x = 13; x >= 7; x--){
            System.out.println("Monday");
        }
        System.out.println("--------------3--------------");
        for(int i = 3; i <= 5; i++){
            System.out.println(i);
        }

        System.out.println("--------------4--------------");
        for(int j = 2; j < 20; j = j + 2){ //j+=2
            System.out.println(j);//2,4
        }
        System.out.println("--------------Nested Loops--------------");

        for(int x = 1; x <=5; x++){//outer loop
            System.out.println("----- " + x + " -----");
            for(int y=1; y<=3; y++){//inner loop
                System.out.println(y + ") Java");
            }
            System.out.println();
        }
        /*
        * 1 2 3 4 5
        * 1 2 3 4 5
        * 1 2 3 4 5
        * */
        System.out.println("--------------Nested Loops B--------------");
        for (int i = 1; i <=3 ; i++) {

            for (int j = 1; j <=5 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }




    }
}
