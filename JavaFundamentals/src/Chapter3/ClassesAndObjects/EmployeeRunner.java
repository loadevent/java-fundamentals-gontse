package Chapter3.ClassesAndObjects;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee em = new Employee("24689","Mike","Ross","mike@yahoo.com","HR",25000);
        em.setFullname("Mike","Smith");

        System.out.println(em.displayDetails());
    }
}
