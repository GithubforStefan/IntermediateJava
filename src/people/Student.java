package people;

import java.util.*;

public class Student extends Person {

    public Student (String name, int age, String city){
        super(name, age, city);
    }
        private ArrayList<String>subjects;
        public void setSubjects(ArrayList<String>subjects){
            this.subjects = subjects;
        }


public void study(){
    System.out.println(this.name + " study");
}
}