import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ComparablePersonTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void compareTo() {
        ComparablePerson p1 = new ComparablePerson("Raziya", "Bashirova");
        ComparablePerson p2 = new ComparablePerson("Clarissa", "Baumgartner");
        ComparablePerson p3 = new ComparablePerson("Paisa", "Ebrahimian");
        ComparablePerson p4 = new ComparablePerson("Mohamed", "Elbahloul");
        ComparablePerson p5 = new ComparablePerson("Hannah", "Grabenwöger");
        ComparablePerson p6 = new ComparablePerson("Jin Xing", "Li");
        ComparablePerson p7 = new ComparablePerson("Simona", "Meyzova");
        ComparablePerson [] array = new ComparablePerson[]{p1, p2, p3, p4, p5, p6, p7};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}