package javaBasics.variableAndDataTypes;

public class Operators {
    public static void main(String[] args) {
        // Assignment Operators
        int x =5;
        int y=10;
//        System.out.println(x);
//        x=x+1;
//        System.out.println(x);
//        x +=1;
//        System.out.println(x);
//        x -= 5;
//        System.out.println(x);
//        x *= 3;
//        System.out.println(x);


        //Comparion Operators
        boolean isEqual = x==y;
        System.out.println(isEqual);

        boolean isNotEqual = x!=y;
        System.out.println(isNotEqual);


        //Logical Operators
        boolean twoCondition;
        twoCondition = isEqual && isNotEqual;
        System.out.println(twoCondition);

        boolean orCondition;
        orCondition = isEqual || isNotEqual;
        System.out.println(orCondition);
    }

}
