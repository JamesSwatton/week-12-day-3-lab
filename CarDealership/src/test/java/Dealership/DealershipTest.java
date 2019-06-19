package Dealership;

import Cars.Car;
import Cars.PetrolCar;
import Components.ElectricCar;
import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealershipTest {

    Dealership dealership;
    PetrolCar petrolCar;
    ElectricCar electricCar;
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
        electricCar = new ElectricCar("Honda", "Air", "White", 4, tyres,25000);
        dealership = new Dealership("Cars, Cars, Cars");
    }


    @Test
    public void hasName(){
        assertEquals("Cars, Cars, Cars", dealership.getName());
    }

    @Test
    public void canAddCar(){
        dealership.addCar(petrolCar);
        dealership.addCar(electricCar);
        assertEquals(2, dealership.getNumOfCars());
    }

    @Test
    public void isInstanceOfCar(){
        dealership.addCar(petrolCar);
        assertTrue(dealership.getCar() instanceof Car);
    }

    @Test
    public void carIsStillPetrolCar(){
        dealership.addCar(petrolCar);
        assertTrue(dealership.getCar() instanceof PetrolCar);
    }

    @Test
    public void carIsStillElectricCar(){
        dealership.addCar(electricCar);
        assertTrue(dealership.getCar() instanceof ElectricCar);
    }

}