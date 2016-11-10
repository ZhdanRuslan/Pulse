package lesson3.task2;

/**
 * Created by admin on 10.11.2016.
 */
public class Employee {

    private CommonSkills commonSkills;
    private PhysicSkills physicSkills;

    public Employee(double commonSkills, double physicSkills) {
        this.commonSkills = new CommonSkills(commonSkills);
        this.physicSkills = new PhysicSkills(physicSkills);
    }

    public Employee() {
        this.commonSkills = new CommonSkills();
        this.physicSkills = new PhysicSkills();
    }

    private class CommonSkills{

        private double levelOfSkills;

        private CommonSkills(double levelOfSkills) {
            this.levelOfSkills = levelOfSkills;
        }

        private CommonSkills() {
            this.levelOfSkills = 0.00;
        }
    }

    private class PhysicSkills{

        private double levelOfSkills;

        private PhysicSkills(double levelOfSkills) {
            this.levelOfSkills = levelOfSkills;
        }

        private PhysicSkills() {
            this.levelOfSkills = 0.00;
        }
    }

}
