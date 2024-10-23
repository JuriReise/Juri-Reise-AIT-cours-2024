package Houmwork.zoo_park.model;

public class Dog extends Pet {

    // FD
    private String breed;
    private double height;
    private double weight;

    //Const-ion

    public Dog(String ID, String type, int age, String nickname, boolean isMale, String breed, double height, double weight) {
        super(ID, type, age, nickname, isMale);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }
    // get&set


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    // voice
    public void voice() {
        System.out.println("Гав-гав! - Гав-гав! - Гав-гав!");
    }

    // toDtr
    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }

}
