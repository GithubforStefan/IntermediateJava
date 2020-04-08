package HealthCare;

import people.*;

import java.util.*;

public class Doctor  {

    private String name;
    private String city;
    private int numberOfPatients;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }


    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public void checkUp(){
        System.out.println("When was your last checkup?");

    }
    public void prescribe(){
        System.out.println("You don't need any medicine except for some sports.");

    }
}
