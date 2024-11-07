package Inheritance;

public class Cat implements Animal {


    void purring() {
        System.out.println("purring");
    }

    void mewaing() {
        System.out.println("Meow… meow… Meow… meow… Meow… meow… Meow… meow… Meow… meow… Meow… meow…");
    }


    @Override
    public void eat() {
        System.out.println("The cat is eating a fish.");

    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping on sofa.");

    }

    @Override
    public void animalSound() {
        mewaing();
    }

    @Override
    public void move() {

    }
}
