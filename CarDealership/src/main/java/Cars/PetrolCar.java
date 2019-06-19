package Cars;

import Components.PetrolEngine;
import Components.Tyre;

import java.util.ArrayList;

public class PetrolCar extends Car{

    private PetrolEngine petrolEngine;

    public PetrolCar(String make, String model, String colour, int numOfWheels, ArrayList<Tyre> tyres, int price) {
        super(make, model, colour, numOfWheels, tyres, price);
        this.petrolEngine = new PetrolEngine(100, 1.4);
    }

    public PetrolEngine getEngine(){
        return this.petrolEngine;
    }
}
