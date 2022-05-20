package winprog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test
    public void addTest()
    {
        assertEquals(5, Calculations.add(2, 3));
    }

    @Test
    public void subtractTest()
    {
        assertEquals(2, Calculations.subtract(5, 3));
    }

    @Test
    public void multiplyTest()
    {
        assertEquals(15, Calculations.multiply(5, 3));
    }

    @Test
    public void divideTest()
    {
        assertEquals(5, Calculations.divide(10, 2));
    }
    

}
