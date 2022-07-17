public class ExceptionsClass {
    public static void main(String[] args) throws Exception {

//        String name[] = {"Shuvashish", "Nafis", "Habib"};
//        try {
//            System.out.println(name[3]);
//        } catch (Exception e) {
//            System.out.println("There was an exception.");
//        } finally {
//            System.out.println("This is final.");
//        }
//        System.out.println(name[0]);

        try{
            printArrayValue();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Got an Array exception.");
        }

    }

    public static void printArrayValue () throws ArrayIndexOutOfBoundsException{
        String name[] = {"Shuvashish", "Nafis", "Habib"};
        System.out.println(name[3]);
        System.out.println(name[1]);
    }
}
