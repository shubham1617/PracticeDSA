package Java_8;

public class Animal {
    private String name;
    private String character;

    public void setAnimal(String name, String character) {
        this.character = character;
        this.name = name;
    }

    public void getAnimal() {
        System.out.println("Animal name: " + name + " and his/her character is " + character);
    }
}
