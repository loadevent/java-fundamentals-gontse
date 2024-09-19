package Chapter2;
/*This class focuses on using normal variables
* and constants. [Values stored inside a constant
*cannot change during the execution of the program]*/
public class VariablesAndConstants {

    public static void main(String[] args) {
        //Declare and Assign [initialize]
        String firstName = "Jessica";
        String lastName = "Specter";
        double salary = 155000.00;
        boolean isMarried = true;
        int birthYear = 1980;
        //Declare age without initial value
        int age;
        //Declaring a constant
        //final dataType VARIABLE_NAME = value
        final int CURRENT_YEAR = 2024;

        //Assign
        age = CURRENT_YEAR - birthYear;

        //Use
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age + " Years old");
        System.out.println("Married: " + isMarried);
        System.out.println("Salary: " + salary);

    }
}
