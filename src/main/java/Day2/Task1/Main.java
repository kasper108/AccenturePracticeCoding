package Day2.Task1;

/*
1) Ask user to input two numbers, compare them and output result:
        Input:
        Enter value a: 10
        Enter value b: 10
        Expected output:
        is 10 equal to 10? - true
        is 10 less than 10? - false
        is 10 less or equal to 10? - true
        is 10 greater than 10? - false
        is 10 greater or equal to 10? - true
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first number : ");
        firstNumber = scanner.nextDouble();

        System.out.println("=============================================");

        System.out.println("Please input second number : ");
        secondNumber = scanner.nextDouble();

        System.out.println("=============================================");

        System.out.println("Is " + firstNumber + " equal to " + secondNumber + " : " + (firstNumber == secondNumber));
        System.out.println("Is " + firstNumber + " less than " + secondNumber + " : " + (firstNumber < secondNumber));
        System.out.println("Is " + firstNumber + " less or equal to " + secondNumber + " : " + (firstNumber <= secondNumber));
        System.out.println("Is " + firstNumber + " greater than " + secondNumber + " : " + (firstNumber > secondNumber));
        System.out.println("Is " + firstNumber + " greater or equal to " + secondNumber + " : " + (firstNumber >= secondNumber));

        System.out.println("=============================================");
    }
}