package Components;

import Cars.Car;

import java.util.ArrayList;

public class ElectricCar extends Car {

    private ElectricEngine electricEngine;

    public ElectricCar(String make, String model, String colour, int numOfWheels, ArrayList<Tyre> tyres, int price) {
        super(make, model, colour, numOfWheels, tyres, price);
        this.electricEngine = new ElectricEngine(150);
        }
}

