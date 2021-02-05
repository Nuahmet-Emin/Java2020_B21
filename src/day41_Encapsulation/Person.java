package day41_Encapsulation;

public class Person {

    private String name;
    private int age;
    private final char gender; // final mean constant

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
