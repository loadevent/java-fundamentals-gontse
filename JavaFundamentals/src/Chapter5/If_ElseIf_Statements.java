package Chapter5;

/*if-else if statements is used when there
are more condition to evaluate
*
        if(condition 1){
        * ...statements
        * }else if(condition 2){
        * ...statements
        * }else if(condition 3){
        * ...statements
        * }else{
        * ...false statements*/
public class If_ElseIf_Statements {
    public static void main(String[] args) {
        /*Test Mark     |       Symbol      Results
        --------------------------------------------
        * 80 - 100      |       A           Outstanding
        * 70 - 79       |       B           Excellent
        * 60 - 69       |       C           Good
        * 50 - 59       |       D           Fair
        * 40 - 49       |       E           Try harder
        * < 40          |       F           Failed*/

        int testMark = 105;
        String strSymbol = "F";
        String strResults = "No Results";

        //Assign Symbol
        if (testMark >= 80 && testMark <= 100){
            strSymbol = "A";
        }else if (testMark >= 70 && testMark < 79){
            strSymbol = "B";
        } else if (testMark >= 60) {
            strSymbol = "C";
        } else if (testMark >= 50) {
            strSymbol = "D";
        } else if (testMark >= 40) {
            strSymbol = "E";
        }else if(testMark < 40){
            strSymbol = "F";
        }
        //Assign results

        if (strSymbol == "A"){
            strResults = "Outstanding";
        }else if(strSymbol == "B"){
            strResults = "Excellent";
        }else if(strSymbol == "C"){
            strResults = "Good";
        }else if(strSymbol == "D"){
            strResults = "Fair";
        }else if(strSymbol == "E"){
            strResults = "Try harder";
        }else if(strSymbol == "F"){
            strResults = "Failed";
        }

        System.out.println("Test Mark: " + testMark + "\n" +
                "Symbol: " + strSymbol + "\n" +
                "Results: " + strResults);


    }
}
