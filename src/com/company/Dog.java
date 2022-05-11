package com.company;

public class Dog {
    private String breed;
    private  String name;
    private int weight;
    private int age;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


    public int getAge() {
        return age;
    }

    void method(String breed,String name, int weight,  int age){
        System.out.println("Cat:"+"Breed"+breed +", Name: "+ name+", Weight:"+weight+"kg,"+" Age:"+age);
    }
}
