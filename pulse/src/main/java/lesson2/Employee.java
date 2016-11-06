package lesson2;

import lesson2.interfaces.Cleanable;
import lesson2.interfaces.Signable;

/**
 * Created by admin on 06.11.2016.
 */
public class Employee implements Comparable<Employee> {

    protected int salary;

    protected Signable signableDelegate = null;
    protected Cleanable cleanableDelegate = null;

    public Employee(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }

//    public Employee() {
//        this.salary = 3200;
//    }
}
