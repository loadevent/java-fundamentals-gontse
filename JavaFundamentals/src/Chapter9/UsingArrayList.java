package Chapter9;

import java.util.ArrayList;

public class UsingArrayList {
    public static void main(String[] args) {
       //Create an array list that will store names
        //create an empty array list
        //ArrayList<datatype> array name = new ArrayList<datatype>();
        ArrayList<String> arNames = new ArrayList<String>();
        //populate the array list
        arNames.add("Jessica");//0
        arNames.add("Mike");//1
        arNames.add("Rachael");
        arNames.add("Trevor");
        display(arNames);

        arNames.add(1,"Michael");
        display(arNames);

        //remove a specific item / name
        //arNames.remove("Mikes");
        //arNames.remove(2);

        //arNames.removeFirst();
        //display(arNames);

       // arNames.removeLast();
      //  display(arNames);

        //remove items based on a condition
        //lambda operator
        arNames.removeIf(name -> (name.contains("a")));
        display(arNames);



    }

    public static void display(ArrayList<String> ar){
        int count = 1;
        for (String name : ar){
            System.out.println(count + " - " + name);
            count++;
        }
        System.out.println("=====================================");
    }
}
