package people;

import HealthCare.*;


public class Person {

    public String name;
    public int age;
    public String city;
    //public static ArrayList<Person> friends;


    public Person(String name, int age, String city   /* ,*ArrayList friends*/) {
        this.name = name;
        this.age = age;
        this.city = city;
        //this.friends = new ArrayList<>();
    }
        public void introduce () {
            System.out.println("My name is " + this.name);
            System.out.println("I'm " + this.age + " years old");
            System.out.println("I live in "+ city);
            System.out.println("My friends are:");
            //for (Person friends : friends) {
              //  System.out.println(friends.name);
            //}
        }
    private Doctor job;

    public Person(){
        this.job=new Doctor();
        job.setName("Doctor Bob");
    }
    public String getSalary() {
        return job.getName();
    }
    }

