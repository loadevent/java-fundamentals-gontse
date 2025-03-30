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
       // display(arNames);

        arNames.add(1,"Michael");
        //display(arNames);

        //remove a specific item / name
        //arNames.remove("Mikes");
        //arNames.remove(2);

        //arNames.removeFirst();
        //display(arNames);

       // arNames.removeLast();
      //  display(arNames);

        //remove items based on a condition
        //lambda operator
       // arNames.removeIf(name -> (name.contains("a")));
        //display(arNames);

       // arrayListDemo();
        accessArrayListElements();


    }

    public static void display(ArrayList<String> ar){
        int count = 1;
        for (String name : ar){
            System.out.println(count + " - " + name);
            count++;
        }
        System.out.println("=====================================");
    }


    public static void accessArrayListElements(){
        ArrayList<Integer> arNumbers = new ArrayList<>();
        ArrayList<Integer> arNumbers2 = new ArrayList<>();
        arNumbers2.add(155);
        arNumbers2.add(235);
        arNumbers2.add(255);
        arNumbers2.add(105);
        arNumbers2.add(97);

        arNumbers.add(5);//first - 0
        arNumbers.add(74);//     - 1
        arNumbers.add(69);//last - 2
        arNumbers.add(1,84);

        arNumbers.addFirst(87);
        arNumbers.addLast(34);

        arNumbers.addAll(3, arNumbers2);

        for (int i = 0; i < arNumbers.size(); i++) {
            System.out.println(i + " : " + arNumbers.get(i));
        }

        System.out.println("===================");

        System.out.println(arNumbers.get(4));
        System.out.println(arNumbers.getFirst());
        System.out.println(arNumbers.getLast());

        int pos = -1;
        for (int i = 0; i < arNumbers.size(); i++) {
            if (arNumbers.get(i) == 97){
                pos = i;
            }
        }

        System.out.println(97 + " is found at position: " + pos);
    }

    public static void arrayListDemo(){
        int[] numbers = new int[3];
        numbers[0] = 155;
        numbers[1] = 115;
        numbers[2] = 235;

       // numbers[5] = 65;//error

        //using arraylist
        ArrayList<Integer> arNumbers = new ArrayList<>();
        ArrayList<Integer> arNumbers2 = new ArrayList<>();
        arNumbers2.add(155);
        arNumbers2.add(235);
        arNumbers2.add(255);
        arNumbers2.add(105);
        arNumbers2.add(97);

        arNumbers.add(5);//first - 0
        arNumbers.add(74);//     - 1
        arNumbers.add(69);//last - 2
        arNumbers.add(1,84);

       arNumbers.addFirst(87);
       arNumbers.addLast(34);

//87, 5, 84, 74, 69
        for (int num : arNumbers){
            System.out.println(num);
        }

        System.out.println("===============================");

        arNumbers.addAll(3, arNumbers2);

        for (int num : arNumbers){
            System.out.println(num);
        }

        System.out.println("===============REMOVE================");

        arNumbers.removeFirst();

        arNumbers.removeLast();

        //remove based on a condition

        //remove all the even numbers
        arNumbers.removeIf(x -> x % 2 == 0);
        //remove all the numbers >= 90
        arNumbers.removeIf(x -> x >= 90);

        for (int num : arNumbers){
            System.out.println(num);
        }

    }






}
