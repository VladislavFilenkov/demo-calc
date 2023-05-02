package by.itacademy.filenkovvladislav;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalcTest {
    @Test
    public void testSum() {
        int expected = 8;
        int actual = Calc.sum(3, 5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 2;
        int actual = Calc.subtract(5, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 8;
        int actual = Calc.multiply(4, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDiv() {
        int expected = 4;
        int actual = Calc.div(8, 2);
        Assertions.assertEquals(expected, actual);
    }
}
