package Chapter6;
/*
 * do{
 *   statements to execute
 * }while(condition is true)
 * */
public class DoWhileLoop {
    public static void main(String[] args) {
        //display hello world 4 times
        int count = 5;
        do {
            System.out.println("Hello World");//1
            count++;
        }while(count <= 4);

        System.out.println(count);
    }
}
