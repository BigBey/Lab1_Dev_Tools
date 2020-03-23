import org.junit.Test;

import static org.junit.Assert.*;

public class TrapezeTest {

    @Test
    public void getPerimeter() {
        Trapeze t = new Trapeze(6,10,5,7);
        double actual = t.getPerimeter();
        double expected = t.getA() + t.getB() + t.getC() + t.getD();
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void getSquare() {
        Trapeze t = new Trapeze(6,10,5,7);
        double actual = t.getSquare();
        double expected = (t.getA()+t.getB())/2
                *Math.sqrt(t.getC()*t.getC()-(((t.getB()-t.getA())*(t.getB()-t.getA())+
                t.getC()*t.getC()-t.getD()*t.getD())/(2*(t.getB()-t.getA())))
                *(((t.getB()-t.getA())*(t.getB()-t.getA())+t.getC()*t.getC()-t.getD()*t.getD())/(2*(t.getB()-t.getA()))));
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void equals1() {
        Trapeze t1 = new Trapeze(6,10,5,7);
        Trapeze t2 = new Trapeze(6,10,5,7);
        boolean actual = t1.equals(t2);
        boolean expected = t1.getA() == t2.getA() && t1.getB() == t2.getB() && t1.getC() == t2.getC() && t1.getD() == t2.getD();
        assertEquals(expected, actual);
    }
}