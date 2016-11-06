package lesson2;

import lesson2.interfaces.Cleanable;
import lesson2.interfaces.Signable;

/**
 * Created by admin on 06.11.2016.
 */
public class Robot implements Signable, Cleanable {
    @Override
    public void doSign() {
        System.out.println("Robot's sign.");
    }

    @Override
    public void doClean() {
        System.out.println("Robot's cleaning");
    }
}
