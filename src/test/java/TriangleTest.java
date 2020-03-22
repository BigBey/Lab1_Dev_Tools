import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void getPerimeter() {
        Triangle t = new Triangle(2,2,3);
        double actual = t.getPerimeter();
        double expected = t.getA()+t.getB()+t.getC();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void getSquare() {
        Triangle t = new Triangle(2,2,3);
        double actual = t.getSquare();
        double p = (t.getA() + t.getB() + t.getC())/2;
        double expected = Math.sqrt(p*(p-t.getA())*(p-t.getB())*(p - t.getC()));
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void equals1() {
        Triangle t1 = new Triangle(2,2,3);
        Triangle t2 = new Triangle(2,2,3);
        boolean actual = t1.equals(t2);
        boolean expected = t1.getA() == t2.getA() && t1.getB() == t1.getB() && t1.getC() == t2.getC();
        assertEquals(expected, actual);
    }
}