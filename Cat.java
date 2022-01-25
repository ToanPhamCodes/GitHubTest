public class Cat extends Animal{
    private String favouriteFood;

    public Cat(String name, int age, String favouriteFood) {
        super(name, age);
        this.favouriteFood = favouriteFood;
    }

    public void makeNoise () {
        System.out.println("Meowww");
    }
}
