package Chapter6;

public class WhileLoop {
    public static void main(String[] args) {
        //display hello world 5 times
        int count = 1;//initialize the loop control variable


        //while(condition to be tested)
        while (count <= 5){
            System.out.println("Hello World");
            count = count + 1;
        }
        //1,2,3,4,5,6
        System.out.println("----------------------------");

        count = 1;
        while (count <= 3){
            System.out.println("Monday");
            count++;
        }



    }
}
