package Chapter5;

/**
 * Use Switch statement as an alternative of if-else if. Use it to check for
 * equality
 *
 */
public class SwitchStatement {
    public static void main(String[] args) {
        int departmentID = 5;
        String supervisor = "None"; //(1,2,3 - Pearson, 4 - Specter, 5 - Ross)
//
//        if (departmentID == 1 || departmentID == 2 || departmentID == 3){
//            supervisor = "Pearson";
//        } else if (departmentID == 4) {
//            supervisor = "Specter";
//        } else if (departmentID == 5) {
//            supervisor = "Ross";
//        }else {
//            supervisor = "Invalid Department Id (" + departmentID + ")";
//        }

        /*swicth(variable to be tested)
        {
            case valueToCompareWith : true clause
            break;
        }
         */
        switch (departmentID){
            case 1:
            case 2:
            case 3:
                supervisor = "Pearson";
                break;
            case 4: supervisor = "Specter";
            break;
            case 5: supervisor = "Ross";
            default:supervisor = "Invalid Department Id (" + departmentID + ")";
        }

        System.out.println(supervisor);

    }
}
