package Chapter6;

public class NestedWhileLoop {
    public static void main(String[] args) {
        /*2 4 6 8 10*/
        /*2 4 6 8 10*/
        /*2 4 6 8 10*/
        int outCount = 1;

        while (outCount <= 3){//outer loop

            int inCount = 2;
            while (inCount <= 10){
                System.out.print(inCount + " ");
                inCount += 2;
            }
            System.out.println();
            outCount += 1;
        }

    }
}
