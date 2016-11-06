package lesson2;

import lesson2.interfaces.Signable;

/**
 * Created by admin on 06.11.2016.
 */
public class Boss extends Manager{
    public Boss(int salary) {
        super(salary);
    }

    @Override
    public void doSign() {
        System.out.println("Bosses sign.");
    }
}
