package io.zipcoder.polymorphism;

public class Dog extends Pet {
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setAge(){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String speak() {
        return "Bark!";
    }

    public String setName() {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }


}
