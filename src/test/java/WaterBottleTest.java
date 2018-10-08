import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() { waterBottle = new WaterBottle(90);}

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void canGetEmptied() {
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void canGetRefilled() {
        assertEquals(100, waterBottle.refill());
    }
}

