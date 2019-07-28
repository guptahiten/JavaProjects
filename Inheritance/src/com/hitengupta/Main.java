package com.hitengupta;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long Silky");

        Fish fish = new Fish("Goldfish",3,1,2,2,1);

        dog.eat();
        System.out.println("-------------------------");
        dog.walk();
        System.out.println("-------------------------");
        dog.run();
        System.out.println("-------------------------");
        fish.swim(25);

    }
}
