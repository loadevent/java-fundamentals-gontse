package Chapter8;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] arNames = {"James", "Caroline", "Kabelo", "Dave", "Gontse"};
        String strName = "Kabelo";
        String sentence = "today is monday, and tomorrow is tuesday";
        int count = 0;
        double[] arPrices = {10.00, 20.00, 35.00, 14.29, 65.99};

       /*
       * for(varaibleType variableName: arrayName)
       * */
//        for(String name : arNames){
//            System.out.print(name + " - ");
//        }
//        for(char letter : strName.toCharArray()){
//            System.out.print(letter + " - ");
//        }
        //count the number of vowels
        for(char vowel : sentence.toCharArray()){
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' ||
                    vowel == 'o' || vowel == 'u'){
                count++;
            }
        }

        for(double price : arPrices){
            if (price % 5 == 0) {
                System.out.print("[" + price + "]   ");
            }
        }

        System.out.println("\n'" + sentence + "'" + " has " + count + " vowels");

    }
}
