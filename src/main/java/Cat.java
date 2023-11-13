public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public boolean eatFood(String foodType) {
        return true;
    }
}
