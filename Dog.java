public class Dog extends Animal{
    private String specie;


    public Dog(String name, int age, String specie) {
        super(name, age);
        this.specie = specie;
    }

    public void makeNoise () {
        System.out.println("Bark");
    }


}
