package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Parrot parrot = new Parrot();
        Cat cat = new Cat();
        Dog dog = new Dog();

        fish.setName("White shark");
        fish.setClassFish("Cartilaginous fish");
        fish.setSquad("Shark squad");
        fish.method( fish.getName(), fish.getClassFish(), fish.getSquad());

        parrot.setName("Jako");
        parrot.setWeight(400);
        parrot.setSize(32);
        parrot.setAge(25);
        parrot.method(parrot.getName(), parrot.getWeight(), parrot.getSize(), parrot.getAge());

        cat.setBreed("YOR");
        cat.setName("Tom");
        cat.setWeight(5);
        cat.setAge(3);
        cat.method(cat.getBreed(), cat.getName(), cat.getWeight(), cat.getAge());

        dog.setBreed("Pug");
        dog.setName("Baddi");
        dog.setWeight(8);
        dog.setAge(5);
        dog.method(dog.getBreed(), dog.getName(), dog.getWeight(), dog.getAge());
    }
}
