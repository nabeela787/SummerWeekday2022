package javaIntermediate.contructors;

public class TestConstructor {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "CS MS", 2022);
        Car lamborghini = new Car("Lamborghini", 2022, "Red");

        System.out.println(bmw.model);
        System.out.println(bmw.make);
        System.out.println(bmw.year);

        System.out.println(lamborghini.model);
        System.out.println(lamborghini.color);
        System.out.println(lamborghini.year);
    }
}
