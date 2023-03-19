package io.zipcoder.polymorphism;

public class Cat extends Pet {
    int age;
    public Cat(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String speak() {
        return "Meow!";
    }
}
