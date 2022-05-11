package com.company;

public class Parrot {
    private  String name;
    private int weight;
    private int size;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    void method(String name, int weight, int size, int age){
        System.out.println("Parrot: "+"Name: "+ name+", Weight:"+weight+"g,"+" Size: "+size+"cm,"+" Age:"+age);
    }
}
