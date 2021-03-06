package day48_Abstraction.AnimalTask;

public class Dolphin extends Animal implements CanSwim, Playable{
    public Dolphin(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin sleeps 11 hours");
    }

    @Override
    public void swim() {
        System.out.println("Dohphin can swim 10 hours");
    }

    @Override
    public void play() {
        System.out.println("Plays with human");
    }
}
