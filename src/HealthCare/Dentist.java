package HealthCare;

import people.*;

public class Dentist extends Person {


    public Dentist(String name, int age, String city) {
        super(name, age, city);
    }

    public void checkUp() {
        System.out.println("Please open your mouth widely and relax.");
    }
}
