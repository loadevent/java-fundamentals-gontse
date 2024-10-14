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

        System.out.println("----------------------------");
        //display 'Monday' 7 times
        //x = 13 --- 13, 12, 11, 10, 9, 8, 7
        for(int x = 13; x >= 7; x--){
            System.out.println("Monday");
        }



    }
}
