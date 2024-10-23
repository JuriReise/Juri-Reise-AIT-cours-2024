package Houmwork.zoo_park.model;

public class Cat extends Pet {
    // FD
    private String breed;
    private double height;
    private double weight;

    //Const-ion

    public Cat(String ID, String type, int age, String nickname, boolean isMale, String breed, double height, double weight) {
        super(ID, type, age, nickname, isMale);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }
    //get&set

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //  voice
    public void voice() {
        System.out.println("Мур-Мяу! - Мур-Мяу! - Мур-Мяу!");

    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
