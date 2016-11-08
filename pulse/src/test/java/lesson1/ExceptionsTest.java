package lesson1;

import lesson1.exc.OutOfBoundsException;
import lesson1.exc.WrongOperationException;
import org.junit.Test;

/**
 * Created by admin on 08.11.2016.
 */
public class ExceptionsTest {

    @Test (expected = OutOfBoundsException.class)
    public void testOutOfBounds() throws WrongOperationException, OutOfBoundsException {
        Calculate.doOperation(2, 1001, "/");
    }

    @Test (expected = ArithmeticException.class)
    public void testArithmeticException() throws WrongOperationException, OutOfBoundsException {
        Calculate.doOperation(2, 0, "/");
    }

    @Test (expected = WrongOperationException.class)
    public void testWrongOperationException() throws WrongOperationException, OutOfBoundsException {
            Calculate.doOperation(2, 10, "qw");
    }
}
