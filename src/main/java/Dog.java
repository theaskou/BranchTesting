public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Vov");
    }

    @Override
    public boolean eatFood(String foodType) {
        return true;
    }
}
