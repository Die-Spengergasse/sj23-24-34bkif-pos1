
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BeamerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BeamerTest
{
    /**
     * Default constructor for test class BeamerTest
     */
    public BeamerTest()
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
    public void testConstuctorValid()
    {
        Beamer beamer1 = new Beamer("Standard");
        assertEquals(2000, beamer1.getRestdauer());
        assertEquals("Standard", beamer1.getType());
        beamer1 = new Beamer("LED");
        assertEquals(60000, beamer1.getRestdauer());
        assertEquals("LED", beamer1.getType());
        beamer1 = new Beamer("Laser");
        assertEquals(20000, beamer1.getRestdauer());
        assertEquals("Laser", beamer1.getType());
    }

    @Test
    public void testRestDauer() {
        Beamer beamer1 = new Beamer("Standard");
        // egen Sie hier einen Beamer an und speichern ihn in einer Variablen.
        // • prüfen Sie, ob die Restdauer stimmt.
        // • Schalten Sie ein.
        // • prüfen Sie, ob die Restdauer stimmt.
        // • Schalten Sie nach ein paar Stunden aus.
        // • prüfen Sie, ob die Restdauer stimmt.
        // • Schalten Sie ein.
        // • prüfen Sie, ob die Restdauer stimmt.
        // • Schalten Sie nach ein paar Stunden aus.
        // • prüfen Sie, ob die Restdauer stimmt.
        beamer1.einschalten();
        assertEquals(1985, beamer1.getRestdauer());
        beamer1.ausschaltenNach(85);
        assertEquals(1900, beamer1.getRestdauer());
        beamer1.einschalten();
        beamer1.ausschaltenNach(1900);
        assertEquals(true, beamer1.brauchtService());

        beamer1 = new Beamer("Standard");
        beamer1.setRestdauer(1515);
        assertEquals(beamer1.einschalten(), true);
        System.out.println(beamer1);
    }

    @Test
    public void testToString() {
        Beamer beamer1 = new Beamer("Standard");
        beamer1.setRestdauer(1515);
        assertEquals(beamer1.einschalten(), true);
        assertEquals("Standard-Beamer: Restlaufzeit: 1500 Stunden (eingeschaltet)", beamer1.toString());
    }

    @Test
    public void testConstructorThrows() {
        boolean exceptionWurdeGeworfen = false;
        try {
            Beamer beamer = new Beamer(null);    
        } catch (IllegalArgumentException e) {
            exceptionWurdeGeworfen = true;
        }
        assertEquals (exceptionWurdeGeworfen, true);
        exceptionWurdeGeworfen = false;
        try {
            Beamer beamer = new Beamer("Sony");    
        } catch (IllegalArgumentException e) {
            exceptionWurdeGeworfen = true;
        }
        assertEquals (exceptionWurdeGeworfen, true);
    }
}

