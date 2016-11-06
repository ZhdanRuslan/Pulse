package lesson2;

/**
 * Created by admin on 06.11.2016.
 */
public class LeadingWorker extends Worker{
    public LeadingWorker(int salary) {
        super(salary);
    }

    @Override
    public void doClean() {
        System.out.println("Leading worker cleaning");
    }
}
