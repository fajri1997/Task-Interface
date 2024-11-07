package Inheritance;

public class Dog implements Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }

    void wagTail() {
        System.out.println("Tail wagging!");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating meat");

    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping ouds");

    }

    @Override
    public void animalSound() {

    }

    @Override
    public void move() {

    }
}
