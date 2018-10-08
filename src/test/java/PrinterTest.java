import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() { printer = new Printer(200, 100);}

    @Test
    public void hasPaper() {
        assertEquals(200, printer.paperLoad());
    }

    @Test
    public void canPrint() {
        assertEquals(190, printer.print(5,2));
        assertEquals(90, printer.toner());

    }

    //    @Test
//    public void cannotPrint() {
//        assertEquals("Not enough paper/toner to perform the action", printer.print(60, 2));
//    }

    @Test
    public void canRefill() {
        assertEquals(200, printer.refill());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.toner());
    }

}
