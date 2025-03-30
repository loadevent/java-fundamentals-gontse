package Chapter3.ClassesAndObjects;

public class StudentRunner {
    public static void main(String[] args) {

        Student st = new Student();//object

        st.setStudentNo("12345");//st-202512345
        st.setFirstname("Gontse");
        st.setLastname("Smith");
        st.setEmail("smith@gmail.com");
        st.setTest1(74);
        st.setTest2(70);
        st.setExamMark(80);

        Student st1 = new Student();//object

        st1.setStudentNo("24678");//st-202512345
        st1.setFirstname("Mike");
        st1.setLastname("Ross");
        st1.setEmail("mike@gmail.com");
        st1.setTest1(85);
        st1.setTest2(65);
        st1.setExamMark(88);

        Student st2 = new Student();//object

        st2.setStudentNo("24678");
        st2.setFirstname("Mike");
        st2.setLastname("Ross");
        st2.setTest1(85);
        st2.setExamMark(88);

        System.out.println(st.displayDetails());
        System.out.println("==============Student 2=====================");
        System.out.println(st1.displayDetails());
        System.out.println("===============Student 3====================");
        System.out.println(st2.displayDetails());

    }
}
