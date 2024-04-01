package N3EX1.Commands;

import N3EX1.Models.Vehicle;

public class AccelerateCommand implements Command {

    private Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.accelerate();
    }

}
