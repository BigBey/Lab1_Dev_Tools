import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getPerimeter() {
        Rectangle r = new Rectangle(6,10);
        double actual = r.getPerimeter();
        double expected = r.getA() + r.getB();
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void getSquare() {
        Rectangle r = new Rectangle(6,10);
        double actual = r.getSquare();
        double expected = r.getA()*r.getB();
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void equals1() {
        Rectangle r1 = new Rectangle(6,10);
        Rectangle r2 = new Rectangle(6,10);
        boolean actual = r1.equals(r2);
        boolean expected = r1.getA() == r2.getA() && r1.getB() == r2.getB();
        assertEquals(expected, actual);
    }
}