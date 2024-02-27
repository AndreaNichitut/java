package ex3Test;

import isp.lab3.exercise3.Exercise3;
import org.junit.Test;

public class Ex3Test {
    @Test
    public void testEx3() {
        Exercise3 vehicle1 = new Exercise3("Dacia","Logan",150,'B');
        System.out.println(vehicle1.toString());
    }
}
