package Chapter2;
/*This class demonstrate the use of escape characters
* Escape characters are string literals used to format
* the output (Page 96)*/
public class EscapeSequence {
    public static void main(String[] args) {
        //Declare and Assign [initialize]
        String firstName = "Mike";
        String lastName = "Ross";
        double salary = 155000.00;
        boolean isMarried = true;
        int birthYear = 1980;
        String websiteURL = "https://www.mikerose.com/profile";
        String sharedFolder = "C:\\tutorials\\java\\chapter 2";

        //Declare age without initial value
        int age;
        //Declaring a constant
        //final dataType VARIABLE_NAME = value
        final int CURRENT_YEAR = 2024;

        age = CURRENT_YEAR - birthYear;
        //use

        System.out.println("Full name: " + firstName + " " + lastName +
                "\nAge: " + age + " years old\nMarried: " + isMarried +
                "\nSalary: " + salary);
        System.out.println("----------------USING TABS------------------------------------------");
        System.out.println("Full Name\tAge\t\t\t\tSalary\t\tMarried?\tWebsite\t\t\t\t\t\t\t\tShared Folder");
        System.out.println(firstName + " " + lastName + "\t" + age + " years old\t" + salary + "\t" +
                isMarried + "\t\t" + websiteURL + "\t" + sharedFolder);



    }
}
