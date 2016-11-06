package lesson2;

import java.util.Arrays;

/**
 * Created by admin on 06.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(35000);
        Manager manager = new Manager(17000);
        Worker worker = new Worker(15000);
        LeadingWorker leadingWorker = new LeadingWorker(16000);
        /*Delegate Boss sign to Manager*/
        manager.signableDelegate = boss;
        manager.signableDelegate.doSign();
        /*Delegate Leading Worker's cleaning to Worker*/
        worker.cleanableDelegate = leadingWorker;
        worker.cleanableDelegate.doClean();
        /*Delegate sign from Boss to Worker*/
        worker.signableDelegate = manager;
        worker.signableDelegate.doSign();

        Employee[] employees = new Employee[4];
        employees[0] = worker;
        employees[1] = boss;
        employees[2] = manager;
        employees[3] = leadingWorker;

        Arrays.sort(employees);

        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].salary);


    }
}
