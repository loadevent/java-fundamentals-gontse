package Chapter8;

public class ParallelArrays {
    public static void main(String[] args) {
        /*
        * Caroline = 75
        * Dave = 78
        * Kabelo = 70
        * Gontse = 80
        * James = 73
        * */
        String[] arStudents = {"James", "Caroline", "Kabelo", "Dave", "Gontse"};
        int[] arTestMarks = {73, 75, 70, 78, 80};

        System.out.println("Student\tTest Mark");
        System.out.println("==========================");

        for (int i = 0; i <= arStudents.length - 1 ; i++) {//0
            System.out.println(arStudents[i] + "\t" + arTestMarks[i]);
        }

    }
}
