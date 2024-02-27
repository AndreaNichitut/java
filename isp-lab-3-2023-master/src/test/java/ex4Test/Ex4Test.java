package ex4Test;

import isp.lab3.exercise4.Exercise4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex4Test {
    @Test
    public void testEx4() {
        Exercise4 point1 = new Exercise4(1, 0, 0);
        Exercise4 point2 = new Exercise4(4, 0, 0);
        double actual=point1.distance(point2);
        double expected=3.0;
        assertEquals(expected, actual,0);
    }
}
