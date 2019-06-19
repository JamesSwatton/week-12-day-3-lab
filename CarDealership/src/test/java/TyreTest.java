import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Offroad", 50,20 );
    }

    @Test
    public void hasType(){
        assertEquals("Offroad", tyre.getType());
    }

    @Test
    public void hasDiameter(){
        assertEquals(50,tyre.getDiameter());
    }

    @Test
    public void hasPrice(){
        assertEquals(20, tyre.getPrice());
    }


}
