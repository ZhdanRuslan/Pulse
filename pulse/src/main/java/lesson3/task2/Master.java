package lesson3.task2;

/**
 * Created by admin on 10.11.2016.
 */
public class Master extends Employee implements Teachable {

    public Master(double commonSkills, double physicSkills) {
        super(commonSkills, physicSkills);
    }

    @Override
    public Employee teachSomeone(Employee target) {
        return null;
    }

}
