package Day4.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tasks1to22 {
    public static void main(String[] args) {

        Print print = new Print();

        // Task 1 - Write a Java program to create a new array list, add some colors
        // (string) and print out the collection.
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Black");

        // Task 2 - Write a Java program to iterate through all elements in an array list
        print.printStringList(colors);

        // Task 3 - Write a Java program to insert an element into the array list at the first position.
        colors.add(0, "Orange");
        print.printStringList(colors);

        // Task 4 - Write a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println(colors.get(4));
        System.out.println("=======================================");

        // Task 5 - Write a Java program to update specific array element by given element.
        colors.set(4, "Purple");
        print.printStringList(colors);

        // Task 6 - 6. Write a Java program to remove the third element from an array list.
        colors.remove(2);
        print.printStringList(colors);

        // Task 7 - Write a Java program to search an element in a array list.
        if(colors.contains("Red")){
            System.out.println("Element found !");
        } else System.out.println("Element not found !");
        System.out.println("=======================================");

        // Task 8 - Write a Java program to sort a given array list.
        Collections.sort(colors);
        print.printStringList(colors);

        // Task 9 - Write a Java program to copy one array list into another.
        ArrayList<String> colorsCopied = new ArrayList<>();
        colorsCopied = colors;
        print.printStringList(colorsCopied);

        // Task 10 - Write a Java program to shuffle elements in a array list.
        Collections.shuffle(colors);
        print.printStringList(colors);

        // Task 11 - Write a Java program to reverse elements in a array list.
        Collections.reverse(colors);
        print.printStringList(colors);

        // Task 12 - Write a Java program to extract a portion of a array list.
        List<String> portion = colors.subList(1,4);
        print.printStringList(portion);

        // Task 13 - Write a Java program to compare two array lists.
        System.out.println(colors.equals(colorsCopied));
        System.out.println("=======================================");

        // Task 14 - Write a Java program of swap two elements in an array list.
        Collections.swap(colors, 1 , 4);
        print.printStringList(colors);

        // Task 15 - Write a Java program to join two array lists.
        ArrayList<String> joinArray = new ArrayList<>();
        joinArray.addAll(colors);
        joinArray.addAll(colorsCopied);
        print.printStringList(joinArray);

        // Task 16 - Write a Java program to clone an array list to another array list.
        ArrayList<String> clonedArray = new ArrayList<>();
        clonedArray = (ArrayList<String>) colors.clone();
        print.printStringList(clonedArray);

        // Task 17 - Write a Java program to empty an array list.
        joinArray.removeAll(joinArray);
        print.printStringList(joinArray);

        // Task 18 - Write a Java program to trim the capacity of an array list the current list size.
        colors.trimToSize();
        print.printStringList(colors);
        // ???
        // Nezinau

        // Task 19 - Write a Java program to increase the size of an array list.
        ArrayList<String> capacityArray = new ArrayList<>(3);
        capacityArray.add("Blue");
        capacityArray.add("Red");
        capacityArray.add("Green");
        capacityArray.ensureCapacity(5);
        capacityArray.add("White");
        capacityArray.add("Black");
        print.printStringList(capacityArray);

        // Task 20 - Write a Java program to replace the second element of a ArrayList with the specified element.
        capacityArray.set(0, "Indigo");
        print.printStringList(capacityArray);

        // Task 21 - Write a Java program to print all the elements of a ArrayList using the position of the elements.
        for(int i = 0 ; i < colors.size() ; i++){
            System.out.println(colors.get(i));
        }
    }
}
