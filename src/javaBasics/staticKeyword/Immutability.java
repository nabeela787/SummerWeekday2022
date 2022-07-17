package javaBasics.staticKeyword;

public class Immutability {
    public static void main(String[] args) {
        String name = "Fatema";
        String studentID = "1234";

        String otherStudentName = "Fatema";
        String thirdStudentName = new String("Fatema");

        boolean isSame = name.equals(thirdStudentName);
        System.out.println(isSame);
    }
}
