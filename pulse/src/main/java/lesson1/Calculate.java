package lesson1;

import lesson1.exc.OutOfBoundsException;
import lesson1.exc.WrongOperationException;

/**
* Class in which launch an arithmetic operation
* on two integer digits. In addition, here is a
* some checks by allow operation and bounds of
* values
* */
public class Calculate {

    /**
     * @param param1 this is a 1st value of operation
     * @param param2 this is a 2nd value of operation
     * @param operation this is an arithmetic operation
     * @throws WrongOperationException this exception
     * produce when in @param operation comes wrong arg
     * @throws OutOfBoundsException produce when param1
     * or param2 out of bounds [-1000 1000]
     * */
    public static void doOperation(int param1, int param2, String operation) throws WrongOperationException, OutOfBoundsException {

        if (param1 > 1000 || param1 < -1000 || param2 > 1000 || param2 < -1000 )
            throw new OutOfBoundsException();

        switch (operation) {
            case "+":
                System.out.print(param1 + param2);
                break;
            case "-":
                System.out.print(param1 - param2);
                break;
            case "*":
                System.out.print(param1 * param2);
                break;
            case "/":
                System.out.print(param1 / param2);
                break;
            default:
                System.out.println("Wrong input!");
                throw new WrongOperationException();
        }
    }
}
