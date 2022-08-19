package Day2.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long a;
        long b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("Please enter number A : ");
        a = scanner.nextLong();

        System.out.println("=========================================");
        System.out.println("Please enter number B : ");
        b = scanner.nextLong();
        System.out.println("=========================================");

        if(a == b || (a < 0 && b > 0) || (a > 100 && b > 100)){
            System.out.println("a is " + a + " and b is " + b + " -> " + true);
        }   else {
            System.out.println("a is " + a + " and b is " + b + " -> " + false);
        }
    }
}
