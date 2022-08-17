package Day2.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean booleanValue;

        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("Please enter boolean value : ");
        booleanValue = scanner.nextBoolean();
        System.out.println("===============================================");

        System.out.println(!booleanValue);
    }
}
