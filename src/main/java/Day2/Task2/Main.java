package Day2.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean firstBoolean;
        boolean secondBoolean;

        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================================");

        System.out.println("Please enter first boolean value: " );
        firstBoolean = scanner.nextBoolean();

        System.out.println("===============================================");

        System.out.println("Please enter first boolean value: " );
        secondBoolean = scanner.nextBoolean();

        System.out.println("===============================================");

        System.out.println("is " + firstBoolean + " and " + secondBoolean + " equal? : " + (firstBoolean == secondBoolean));

        System.out.println("===============================================");
    }
}
