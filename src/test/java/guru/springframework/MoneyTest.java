package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by jt on 2018-10-04.
 */
public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    // To-Do List for this branch (3.19 video):
        // 1. Determine if two Dollar objects are equal (Dollar objects are value objects - 5 and 10 are diff objects)
    @Test
    void testEquality() {
        // If I do assert equals on two of the same class, it usually just checks that they are of the same class, not if
        // their values are the same

        // For example, if I ran the below test without the equals() method in Dollar, it would say that they are not equal
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }
}
