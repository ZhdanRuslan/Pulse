package lesson2.interfaces;

import lesson2.Worker;

/**
 * Created by admin on 06.11.2016.
 */
public class LeadingWorker extends Worker{
    @Override
    public void doClean() {
        System.out.println("Leading worker cleaning");
    }
}
