package com.company;

public class Fish {
    private String name ;
    private String classFish;
    private String squad;



    public void setName(String name) {
        this.name = name;
    }
    public void setClassFish(String classFish) {
        this.classFish = classFish;
    }
    public void setSquad(String squad) {
        this.squad = squad;
    }


    public String getName() {
        return name;
    }
    public String getClassFish() {
        return classFish;
    }
    public String getSquad() {
        return squad;
    }

     void method(String name, String classFish,String squad){
        System.out.println("Fish: "+"Name: "+ name+", Class Fish: "+classFish+", Squad: "+""+squad);
    }
}
