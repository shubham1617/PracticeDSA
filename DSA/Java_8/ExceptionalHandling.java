package Java_8;

public class ExceptionalHandling {

    public static void main(String[] args) {

        try {
            System.out.println("In try block");
            Animal animal = null;
            animal.getAnimal();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("In catch block");
            e.printStackTrace();
        } finally {
            System.out.println("In Finally Block");
        }

    }
}
