package N3EX1;

import N3EX1.Commands.AccelerateCommand;
import N3EX1.Commands.Command;
import N3EX1.Commands.StartCommand;
import N3EX1.Commands.StopCommand;
import N3EX1.Models.Vehicle;
import N3EX1.Models.Vehicles.Bicycle;
import N3EX1.Models.Vehicles.Car;
import N3EX1.Models.Vehicles.Plane;
import N3EX1.Models.Vehicles.Ship;

public class App {

    private App(){}

    public static void runProgram() {

        Vehicle bicycle = new Bicycle();
        Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle ship = new Ship();

        Command startBicycle = new StartCommand(bicycle);
        Command accelerateBicycle = new AccelerateCommand(bicycle);
        Command stopBicycle = new StopCommand(bicycle);

        Command startCar = new StartCommand(car);
        Command accelerateCar = new AccelerateCommand(car);
        Command stopCar = new StopCommand(car);

        Command startPlane = new StartCommand(plane);
        Command acceleratePlane = new AccelerateCommand(plane);
        Command stopPlane = new StopCommand(plane);

        Command startShip = new StartCommand(ship);
        Command accelerateShip = new AccelerateCommand(ship);
        Command stopShip = new StopCommand(ship);

        startBicycle.execute();
        accelerateBicycle.execute();
        stopBicycle.execute();

        System.out.println();

        startCar.execute();
        accelerateCar.execute();
        startCar.execute();

        System.out.println();

        startPlane.execute();
        acceleratePlane.execute();
        stopPlane.execute();

        System.out.println();

        startShip.execute();
        accelerateShip.execute();
        stopShip.execute();

    }

}
