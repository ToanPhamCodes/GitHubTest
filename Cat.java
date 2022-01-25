public class Cat extends Animal{
    private String favouriteFood;
    private int mouseCaught;

    public Cat(String name, int age, String favouriteFood) {
        super(name, age);
        this.favouriteFood = favouriteFood;
    }

    public void makeNoise () {
        System.out.println("Meowww");
    }
    public void catchMouse (int numMouse)
    {
        this.mouseCaught += numMouse;
    }
}
