package Day2.Task3and4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Please input first number : ");
        number = scanner.nextLong();
        System.out.println("=============================================");

        if(number%2 == 0){
            System.out.println("Even number ! " + false);
        } else {
            System.out.println("Odd number ! " + true);
        }
        System.out.println("=============================================");
    }
}
