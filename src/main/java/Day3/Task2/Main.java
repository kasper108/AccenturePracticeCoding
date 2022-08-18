package Day3.Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbersArray = new int[4];
        int[] copiedArray = new int[4];

        for(int i = 0 ; i < 4 ; i++){
            numbersArray[i] = new Random().nextInt();
        }

        for(int i = 0 ; i < 4 ; i++){
            copiedArray[i] = numbersArray[i];
        }

        for(long number : copiedArray){
            System.out.print(number + " ");
        }
    }
}
