package N3EX1.Commands;

import N3EX1.Models.Vehicle;

public class StopCommand implements Command {

    private Vehicle vehicle;

    public StopCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.stop();
    }

}
