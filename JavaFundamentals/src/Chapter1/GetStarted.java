package Chapter1;
/*Getting started with different
data types in Java
* */
public class GetStarted {
    public static void main(String[] args) {
        //Declare
        int intAge;//This is just an example of age
        short shortAge;
        long longAge;
        double wage;
        float salary;
        boolean isMarried;
        char gender;
        String firstName, lastName;
        String address;

        //Assign
        intAge = 25;
        shortAge = 25;
        longAge = 26;
        wage = 5000.59;
        salary = 5000.59F;
        isMarried = true;
        gender = 'F';
        firstName = "Jessica";
        lastName = "Pearson";
        address = "244 Main Street, Johannesburg";

        firstName = "Carol";

        //Use
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + intAge);
        System.out.println("Gender: " + "(" + gender + ")");
        System.out.println("Wage: " + wage);
        System.out.println("Salary: " + salary);
        System.out.println("Married: " + isMarried);
        System.out.println("Address: " + address);
    }
}
