package Chapter5;
/*Use if-else to execute code when the condition evaluate
* to true or false */
public class If_Else_Statements {
    public static void main(String[] args) {
        /*if(condition){
        * ...statements when condition is true
        * }else{
        * ...statements when condition is false
        * }
        * */
        double testMark = 59;
        String strName = "Dave";
        String strSymbol = "a";

        if (testMark > 60){
            System.out.println("You passed the test");
        }else{
            System.out.println("You failed the test");
        }

        if (strName == "David"){
            System.out.println("Welcome, " + strName);
        }else{
            System.out.println("You are not David! Your name is " + strName );
        }

        if (strSymbol == "A"){
            System.out.println("Outstanding");
        }else{
            System.out.println("You need a better grade symbol");
        }


    }
}
