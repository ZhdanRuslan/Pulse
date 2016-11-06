package lesson2;

import lesson2.interfaces.Cleanable;

/**
 * Created by admin on 06.11.2016.
 */
public class Worker extends Employee implements Cleanable {
    public Worker(int salary) {
        super(salary);
    }

    @Override
    public void doClean() {
        System.out.println("Worker cleaning");
    }
}
