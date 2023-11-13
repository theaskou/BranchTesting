public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        cat.makeSound();

        dog.makeSound();


        cat.eatFood("fish");

        dog.eatFood("meat");

    }
}
