package ex1Test;

import isp.lab3.exercise1.Exercise1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex1Test {
    @Test
    public void testEx1() {
        Exercise1 myTree1 = new Exercise1();
        myTree1.grow(10);
        assertEquals(25, myTree1.getHeight());
        myTree1.grow(-30);
        assertEquals(25, myTree1.getHeight());
        System.out.println(myTree1.toString());
    }
}

