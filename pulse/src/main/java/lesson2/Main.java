package lesson2;

import lesson2.interfaces.LeadingWorker;
import lesson2.interfaces.Signable;

/**
 * Created by admin on 06.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Manager manager = new Manager();
        Worker worker = new Worker();
        LeadingWorker leadingWorker = new LeadingWorker();
        /*Delegate Boss sign to Manager*/
        manager.signableDelegate = boss;
        manager.signableDelegate.doSign();
        /*Delegate Leading Worker's cleaning to Worker*/
        worker.cleanableDelegate = leadingWorker;
        worker.cleanableDelegate.doClean();
        /*Delegate sign from Boss to Worker*/
        worker.signableDelegate = manager;
        worker.signableDelegate.doSign();


    }
}
