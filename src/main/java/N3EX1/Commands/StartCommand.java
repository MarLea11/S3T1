package N3EX1.Commands;

import N3EX1.Models.Vehicle;

public class StartCommand implements Command{

    private Vehicle vehicle;

    public StartCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.start();
    }

}
