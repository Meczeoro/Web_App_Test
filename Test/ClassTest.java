import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mec on 16/11/2016.
 */
public class ClassTest {
    @Test
    public void multiplicationOfIntegers() {
        DefaultClass tester = new DefaultClass(); // MyClass is tested

        // assert statements
        assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
        assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
        assertEquals("5 x 5 must be 25", 25, tester.multiply(5,5));
        assertEquals("-5 x -5 must be 25", 25, tester.multiply(-5,-5));
        assertEquals("-5 x 5 must be -25", -25, tester.multiply(-5,5));
        assertEquals("5 x -5 must be -25", -25, tester.multiply(5,-5));
    }
}
