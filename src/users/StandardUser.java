package users;

import devices.*;

public class StandardUser extends BasicUser{

    public StandardUser(String email, double price, int numberOfParallelScreens) {
        super(email, price, numberOfParallelScreens);
    }

    public void watchHd(Device device, String movie){
        System.out.println("User " + email + " watches " + movie+ " in HD.");
    }
}
