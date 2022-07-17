package javaBasics.stringPractice;

public class StringPractice {

    static String name = "Gaurav";

    public static void main(String[] args) {
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());

        //Casting Primitive to Nonprimitive
        int age = 25;
        String myStringAge = String.valueOf(age);
        System.out.println(myStringAge);

        //Casting Nonprimitive to Primitive
        String myAge = "25";
        int myNumericAge = Integer.valueOf(myAge);
        System.out.println(myNumericAge);
    }
}
