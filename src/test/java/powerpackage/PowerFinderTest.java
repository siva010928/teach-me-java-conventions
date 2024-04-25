package powerpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerFinderTest {
    @Test
    void shouldReturnOneWhenOneRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.getPowerOf(1, 1);
        int expectedPower = 1;
        assertEquals(expectedPower, actualPower);
    }

    @Test
    void shouldReturnTwoWhenTwoRaisedToOme() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.getPowerOf(2, 1);
        int expectedPower = 2;
        assertEquals(expectedPower, actualPower);
    }

    @Test
    void shouldReturnFourWhenTwoRaisedToTwo() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.getPowerOf(2, 2);
        int expectedPower = 2 * 2;
        assertEquals(expectedPower, actualPower);
    }

    @Test
    void shouldReturnOneWhenTwoRaisedToThree() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.getPowerOf(3, 2);
        int expectedPower = 3 * 3;
        assertEquals(expectedPower, actualPower);
    }

}
