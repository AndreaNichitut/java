package ex5Test;

import isp.lab3.exercise5.Exercise5;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ex5Test {
    @Test
    public void testEx5() {
        String[] products = {"Coca-Cola", "Fanta", "Sprite", "Apa minerala", "Suc natural"};
        int[] prices = {5, 5, 5, 3, 8};
        Exercise5 vendingMachine = new Exercise5(products, prices);
        String[] expected={"1Coca-Cola","2Fanta","3Sprite","4Apa minerala","5Suc natural"};
        assertArrayEquals(expected,vendingMachine.displayProduct());
        vendingMachine.insertCoin(10);
        assertEquals(10,vendingMachine.getCredit());
        vendingMachine.insertCoin(10);
        assertEquals(20,vendingMachine.getCredit());
        assertEquals("Suc natural",vendingMachine.selectProduct(5));
    }
}
