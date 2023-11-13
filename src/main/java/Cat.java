public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public boolean eatFood(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood == true) {
            System.out.println("Katten spinder");
        } else System.out.println("Katten hvæser");
    }
}
