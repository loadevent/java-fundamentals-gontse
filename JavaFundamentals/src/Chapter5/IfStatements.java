package Chapter5;

public class IfStatements {
    public static void main(String[] args) {
        //If statements - syntax
        /*if(condition){
              ... code to be executed
        }
         */
        int testMark = 74;

        /*1. without curly brackets
        To be used when there is only one line of code to be
        executed when the evaluation results to true
         */

        if(testMark == 65)
            System.out.println("You have passed the test");

        /*2. With curly brackets
        * Used when there are multiple lines of code
        * to be executed*/

        if(testMark == 70) {
            System.out.println("You have passed the test");
            System.out.println("Would you like to write another test");
        }

        if(testMark > 70) {
            System.out.println("You have passed the test with the score of: " + testMark);
            System.out.println("Would you like to write another test?");
        }


    }
}
