
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
    {
    }

    @Test
    public void demoGleichheit() {
        String s1 = new String ("Franz");
        String s2 = new String ("Franz");
        if (s1 == s2) {
            System.out.println("Beide sind gleiche Objekte");
        }
        else
        {
            System.out.println("Sind verschiedene Objekte");

        }
        if (s1.equals(s2)) {
            System.out.println("Beide sind inhaltsgleich");
        }
        else
        {
            System.out.println("Sind unterschiedlich im Inhalt");

        }
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
    public void testPersonErzeugen()
    {
        // Prüfen, dass die Setter und Getter funktionieren
        Person person1 = new Person("Franz", true, 180, 65);
        assertEquals("Franz", person1.getName());
        assertEquals(true, person1.getMaennlich());
        assertEquals(person1.getGroesse(), 180);
        assertEquals(65, person1.getGewicht());
        boolean exceptionThrown;

        // Anlegen einer Testperson mit name = null überprüfen
        exceptionThrown = false;
        try {
            person1 = new Person (null, false, 175, 55);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertEquals (exceptionThrown, true); 

        // Zu wenig Gewicht
        exceptionThrown = false;
        try {
            person1 = new Person ("Barbara", false, 175, 29);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertEquals (exceptionThrown, true);
        // zu viel Gewicht
        exceptionThrown = false;
        try {
            person1 = new Person ("Barbara", false, 175, 151);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertEquals (exceptionThrown, true);   

        // zu klein:
        exceptionThrown = false;
        try {
            person1 = new Person ("Barbara", false, 109, 55);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertEquals (exceptionThrown, true);
        // zu gross
        exceptionThrown = false;
        try {
            person1 = new Person ("Barbara", false, 221, 55);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertEquals (exceptionThrown, true); 
        System.out.println ("alle Tests in Erzeugen gingen gut");

    }

    @Test
    public void testBMIBerechnung()
    {
        Person person1 = new Person("Barbara", false, 185, 65);
        assertEquals(18.991964938f, person1.bmiBerechnen(), 0.000001);
        person1.printPerson();
    }

    @Test
    public void testBMIAusgeben()
    {
        Person person2 = new Person("Georg", true, 178, 77);
        assertEquals("24.302488 Normalgewicht", person2.bmiAusgeben());
        person2 = new Person("Georg", true, 178, 45);
        assertEquals("24.302488 Normalgewicht", person2.bmiAusgeben());
        
    }
}


