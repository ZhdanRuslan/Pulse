package lesson2;

import lesson2.interfaces.Signable;

/**
 * Created by admin on 06.11.2016.
 */
public class Manager extends Employee implements Signable {

    @Override
    public void doSign() {
        System.out.println("Manager's sign");
    }
}
