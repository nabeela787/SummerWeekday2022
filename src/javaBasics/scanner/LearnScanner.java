package javaBasics.scanner;

import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name:");
//
//        String name = java.basics.scanner.nextLine();
//        System.out.println(name);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Addition: " + doAddition(x, y));
        System.out.println("Substraction: "+ doSubtraction(x, y));
        System.out.println("Multiplication: "+ doMultiplication(x, y));
        System.out.println("Division: "+ doDivision(x, y));
    }

    static int doAddition (int num1, int num2) {
        return num1 + num2;
    }

    static int doSubtraction (int num1, int num2) {
        return num1 - num2;
    }

    static int doMultiplication (int num1, int num2) {
        return num1 * num2;
    }

    static int doDivision (int num1, int num2) {
        return num1 / num2;
    }

}
