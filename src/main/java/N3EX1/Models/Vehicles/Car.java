package N3EX1.Models.Vehicles;

import N3EX1.Models.Vehicle;

public class Car extends Vehicle {

    public void start(){
        System.out.println("Start car");
    }

    public void accelerate(){
        System.out.println("Accelerate car");
    }

    public void stop(){
        System.out.println("Stop car");
    }

}
