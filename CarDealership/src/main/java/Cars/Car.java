package Cars;

import Components.Engine;
import Components.Tyre;

import java.util.ArrayList;

public abstract class Car {

    private String make;
    private String model;
    private String colour;
    private int numOfWheels;
    private ArrayList<Tyre> tyres;
    private int price;
    private Engine engine;

    public Car(String make, String model, String colour, int numOfWheels, ArrayList<Tyre> tyres, int price){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.numOfWheels = numOfWheels;
        this.tyres = tyres;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public int getPrice() {
        return price;
    }
}
