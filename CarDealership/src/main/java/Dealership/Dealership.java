package Dealership;

import Cars.Car;
import Cars.PetrolCar;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Car> cars;

    public Dealership(String name){
        this.name = name;
        this.cars = new ArrayList<Car>();
    }

    public String getName() {
        return this.name;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public int getNumOfCars(){
        return this.cars.size();
    }

    public Car getCar(){
        return this.cars.get(0);
    }

    public ArrayList<Car> getCarsByEngineType(String type){
        ArrayList<Car> carsByEngineType = new ArrayList<Car>();
        for(Car car : this.cars){
            if (car instanceof PetrolCar){
                carsByEngineType.add(car);
            }
        }
        return carsByEngineType;
    }
}
