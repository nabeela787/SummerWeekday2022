package javaBasics.objectPractice;

public class ObjPractice {
    ObjPractice(){

    }

    public static void main(String[] args) {
        int age = 20;
//        ObjPractice obj = new ObjPractice();

        Cat romeo = new Cat();
        romeo.name = "Romeo";
        romeo.age = 2;
        romeo.hasFur = true;
        romeo.color = "gray";
        romeo.gender = "male";

        Cat rex = new Cat();
        rex.name = "Rex";
        rex.age = 2;
        rex.hasFur = true;
        rex.color = "orange";
        rex.gender = "male";

        System.out.println(romeo);

    }
}
