import Components.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolEngineTest {

    PetrolEngine petrolEngine;

    @Before
    public void before(){
        petrolEngine = new PetrolEngine(100, 1.8);
    }

    @Test
    public void hasType(){
        assertEquals("Petrol", petrolEngine.getType());
    }

    @Test
    public void hasPrice(){
        assertEquals(100, petrolEngine.getPrice());
    }

    @Test
    public void hasSize(){
        assertEquals(1.8, petrolEngine.getSize(), 0.01);
    }

    @Test
    public void canRev(){
        assertEquals("VROOM VROOM", petrolEngine.rev());
    }
}
