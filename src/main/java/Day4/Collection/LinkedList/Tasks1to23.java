package Day4.Collection.LinkedList;

import Day4.Collection.ArrayList.Print;

import java.util.*;

public class Tasks1to23 {
    public static void main(String[] args) {

        Print print = new Print();

        LinkedList<String> animals = new LinkedList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("degu");
        animals.add("dolphin");
        animals.add("monkey");

        print.printStringList(animals);

        // Task 1 - Write a Java program to append the specified element to the end of a linked list.
        animals.add("elephant");
        print.printStringList(animals);

        // Task 2 - Write a Java program to iterate through all elements in a linked list.
        print.printStringList(animals);

        // Task 3 - Write a Java program to iterate through all elements in
        // a linked list starting at the specified position.

        Iterator<String> startPosition = animals.listIterator(2);

        while(startPosition.hasNext()){
            System.out.println(startPosition.next());
        }
        System.out.println("=======================================");

        // Task 4 - Write a Java program to iterate a linked list in reverse order.
        Iterator<String> reverseAnimals = animals.descendingIterator();
        while (reverseAnimals.hasNext()){
            System.out.println(reverseAnimals.next());
        }
        System.out.println("=======================================");

        // Task 5 - Write a Java program to insert the specified element at the specified position in the linked list.

        animals.add(3, "crocodile");
        print.printStringList(animals);

        // Task 6 - Write a Java program to insert elements into the linked list at the first and last position.

        animals.add(0, "snake");
        animals.add(animals.size(), "tiger");
        print.printStringList(animals);

        // Task 7 - Write a Java program to insert the specified element at the front of a linked list.
        animals.offerFirst("lion");
        print.printStringList(animals);

        // Task 8 - Write a Java program to insert the specified element at the end of a linked list.
        animals.offerLast("rabbit");
        print.printStringList(animals);

        // Task 9 - Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList<String> newAnimals = new LinkedList<>();
        newAnimals.add("bear");
        newAnimals.add("fox");

        animals.addAll(1, newAnimals);
        print.printStringList(animals);

        // Task 10 - Write a Java program to get the first and last occurrence of
        // the specified elements in a linked list.

        String firstElement = animals.getFirst();
        String lastElement = animals.getLast();

        System.out.println("First element - > " + firstElement);
        System.out.println("Last element - > " + lastElement);
        System.out.println("=======================================");

        // Task 11 - Write a Java program to display the elements and their positions in a linked list.
        for(int i = 0 ; i < animals.size() ; i++){
            System.out.println("Animal : " + animals.get(i) + " , Position -> " + i );
        }
        System.out.println("=======================================");

        // Task 12 - Write a Java program to remove a specified element from a linked list.

        animals.remove(8);
        print.printStringList(animals);

        // Task 13 - Write a Java program to remove first and last element from a linked list.

        LinkedList<String> copiedAnimals = (LinkedList<String>) animals.clone();
        copiedAnimals.removeFirst();
        copiedAnimals.removeLast();
        print.printStringList(copiedAnimals);

        // Task 14 - Write a Java program to remove all the elements from a linked list.

        copiedAnimals.removeAll(copiedAnimals);
        print.printStringList(copiedAnimals);

        // Task 15 - Write a Java program of swap two elements in a linked list.
        Collections.swap(animals, 1 , 2);
        print.printStringList(animals);

        // Task 16 - Write a Java program to shuffle the elements in a linked list.
        Collections.shuffle(animals);
        print.printStringList(animals);

        // Task 17 - Write a Java program to join two linked lists.
        LinkedList<String> joinList = new LinkedList<>();
        LinkedList<String> animals2 = new LinkedList<>();

        animals2.add("hyena");
        animals2.add("gorilla");
        animals2.add("panda");
        animals2.add("skunk");

        joinList.addAll(animals);
        joinList.addAll(animals2);

        print.printStringList(joinList);

        // TAsk 18 - Write a Java program to clone an linked list to another linked list.
        // See task 13 , for solution

        // Task 19 - Write a Java program to remove and return the first element of a linked list.
        // ????
        animals.pop();
        print.printStringList(animals);

        // Task 20 - Write a Java program to retrieve but does not remove, the first element of a linked list.
        String firstOne = animals.peekFirst();
        System.out.println(firstOne);
        System.out.println("=======================================");

        // Task 21 - Write a Java program to retrieve but does not remove, the last element of a linked list.
        String lastOne = animals.pollLast();
        System.out.println(lastOne);
        System.out.println("=======================================");

        // Task 22 - Write a Java program to check if a particular element exists in a linked list.

        System.out.println(animals.contains("snake"));
        System.out.println("=======================================");

        // Task 23  - Write a Java program to convert a linked list to array list.
        List<String> convertedList = new ArrayList<>(animals);
        print.printStringList(animals);
    }
}
