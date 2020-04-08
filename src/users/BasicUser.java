package users;

import devices.*;

public class BasicUser {
    public String email;
    public double price;
    public int numberOfParallelScreens;

public BasicUser (String email, double price, int numberOfParallelScreens){
    this.email = email;
    this.price = price;
    this.numberOfParallelScreens = numberOfParallelScreens;

}
public void watch (Device device, String movie){
    System.out.println("User " + email + " watches " + movie +  ".");
}

}
