package Cars;

import Components.PetrolEngine;
import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Tyre tyre;
    ArrayList<Tyre> tyres;


    @Before
    public void before(){
        tyre = new Tyre("offroad", 60, 15);
        tyres = new ArrayList<Tyre>();
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        petrolCar = new PetrolCar("Ford", "Fiesta", "Beige", 4, tyres,2000);
    }

    @Test
    public void getMake() {
        assertEquals("Ford", petrolCar.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Fiesta", petrolCar.getModel());
    }

    @Test
    public void getColour() {
        assertEquals("Beige", petrolCar.getColour());
    }

    @Test
    public void getNumOfWheels() {
        assertEquals(4, petrolCar.getNumOfWheels());
    }

    @Test
    public void has4Tyres() {
        assertEquals(4, petrolCar.getTyres().size());
    }

    @Test
    public void getPrice() {
        assertEquals(2000, petrolCar.getPrice());
    }
}