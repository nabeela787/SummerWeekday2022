package javaBasics.methods;

public class IntroToMethods {
    public static void main(String[] args) {
        doSomething();

//        System.out.println(5+ doSomethingElse());
//        int z = doSomethingElse();
//        System.out.println(5 + z);

        String w = somethingString();
        System.out.println(5 + w);

    }

    static void doSomething() {
        System.out.println("This method is doing something");
    }

//    static int doSomethingElse() {
//        int x= 5;
//        int y = 10;
//        return x+y;
//    }

    static String somethingString() {
        String x = "5";
        String y = "10";
        return x+y;
    }
}
