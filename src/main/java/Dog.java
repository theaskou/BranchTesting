public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Vov");
    }

    @Override
    public boolean eatFood(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood){
        if (mood == true){
            System.out.println("Hunden logrer");
        }
        else System.out.println("Hunden knurrer");
    }
}
