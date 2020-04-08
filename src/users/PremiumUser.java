package users;

import devices.*;

public class PremiumUser extends StandardUser{
    public PremiumUser(String email, double price, int numberOfParallelScreens) {
        super(email, price, numberOfParallelScreens);
    }

    public void watchUltraHd(Device device, String movie){
        System.out.println("User " + email + " watches " + movie+ " in UltraHD.");
    }
}
