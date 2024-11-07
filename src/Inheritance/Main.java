package Inheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();
        dog.wagTail();

        System.out.println("################################################################");
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.mewaing();
        cat.purring();

        System.out.println("################################################################");




        System.out.println("my pet Dog:");
        dog.eat();
        dog.sleep();
        dog.animalSound();

        System.out.println("my pet Cat:");
        cat.eat();
        cat.sleep();
        cat.animalSound();
    }
}