package lesson1;

import lesson1.exc.OutOfBoundsException;
import lesson1.exc.WrongOperationException;
import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for Calculate.
 */
public class AppTest extends OutputTest {

    @Test
    public void testOutput() throws WrongOperationException, OutOfBoundsException {
        Calculate.doOperation(2, 5, "+");
        Assert.assertEquals("7", output.toString());
    }
}
