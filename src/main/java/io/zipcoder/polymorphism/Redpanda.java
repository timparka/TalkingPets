package io.zipcoder.polymorphism;

public class Redpanda extends Pet {
    String gender;
    public Redpanda(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


    public String speak() {
        return "Ah!";
    }

    public void setName(){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
