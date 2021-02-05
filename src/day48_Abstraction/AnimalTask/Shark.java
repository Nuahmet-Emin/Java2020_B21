package day48_Abstraction.AnimalTask;

public class Shark extends Animal implements Predator, CanSwim{
    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Shark sleeps 0 hours");
    }

    @Override
    public void swim() {
        System.out.println("Shark can swim long");
    }

    @Override
    public void hunt() {
        System.out.println("Shark hunts fish");
    }
}
