package javaIntermediate.oopsPolymorphism;

public class LearnCompileTimePoly {
    public static void main(String[] args) {
        int x = 10, y = 5, z = 25;
        short a = 15, b = 100;
        int sumOfTwoNumbers = addition(x, y);
    }

    static int addition (int num1, int num2){
        return num1+num2;
    }

    static int addition (int num1, int num2, int num3) {
        return num1 + num2;
    }

    static int addition (int num1, short num2){
        return num1+num2;
    }

    static int addition (short num1, int num2){
        return num1+num2;
    }

}
