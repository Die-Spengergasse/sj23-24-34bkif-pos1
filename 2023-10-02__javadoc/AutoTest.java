
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AutoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AutoTest
{
    private Auto markenTestAuto;

    /**
     * Default constructor for test class AutoTest
     */
    public AutoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        markenTestAuto = new Auto();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void ersterTest()
    {
        //Auto auto1 = new Auto();
        //auto1.setPS(90);
        //assertEquals(90, auto1.getPS());
    }

    @Test
    public void testErlaubteMarken()
    {
        markenTestAuto.setMarke("VW");
        assertEquals("VW", markenTestAuto.getMarke());
        markenTestAuto.setMarke("Audi");
        assertEquals("Audi", markenTestAuto.getMarke());
        markenTestAuto.setMarke("Skoda");
        assertEquals("Skoda", markenTestAuto.getMarke());
    }

    @Test
    public void testVerboteneMarken() {
        boolean exceptionExists;
        try {
            exceptionExists = false;
            markenTestAuto.setMarke("BMW");
        } catch (IllegalArgumentException e) {
            exceptionExists = true;
        }
        assertEquals ( true, exceptionExists);
               try {
            exceptionExists = false;
            markenTestAuto.setMarke("Mercedes");
        } catch (IllegalArgumentException e) {
            exceptionExists = true;
        }
        assertEquals ( true, exceptionExists);
    }
}

