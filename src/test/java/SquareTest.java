import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void getPerimeter() {
        Square s = new Square(5.5);
        double actual = s.getPerimeter();
        double expected = s.getA()*4;
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void getSquare() {
        Square s = new Square(5.5);
        double actual = s.getSquare();
        double expected = s.getA()*s.getA();
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void equals1() {
        Square s1 = new Square(5.5);
        Square s2 = new Square(5.5);
        boolean actual = s1.equals(s2);
        boolean expected = s1.getA() == s2.getA();
        assertEquals(expected, actual);
    }
}