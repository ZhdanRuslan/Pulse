package lesson3.task2;

/**
 * Created by admin on 10.11.2016.
 */
public abstract class Employee implements Cloneable {

    private CommonSkills commonSkills;
    private PhysicSkills physicSkills;

    public Employee() {
        this.commonSkills = new CommonSkills();
        this.physicSkills = new PhysicSkills();
    }

    public Employee(double commonSkills, double physicSkills) {
        this.commonSkills = new CommonSkills(commonSkills);
        this.physicSkills = new PhysicSkills(physicSkills);
    }

    private class CommonSkills implements Cloneable{

        private double levelOfSkills;

        private CommonSkills() {
            this.levelOfSkills = 0.00;
        }

        private CommonSkills(double levelOfSkills) {
            this.levelOfSkills = levelOfSkills;
        }

        @Override
        public String toString() {
            return "CommonSkills{" +
                    " levelOfSkills=" + levelOfSkills +
                    " hashCode=" + hashCode() +
                    '}';
        }
    }

    private class PhysicSkills implements Cloneable{

        private double levelOfSkills;

        public PhysicSkills() {
            this.levelOfSkills = 0.00;
        }

        public PhysicSkills(double levelOfSkills) {
            this.levelOfSkills = levelOfSkills;
        }

        @Override
        public String toString() {
            return "PhysicSkills{" +
                    " levelOfSkills=" + levelOfSkills +
                    " hashCode=" + hashCode() +
                    '}';
        }
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.commonSkills = new CommonSkills(commonSkills.levelOfSkills);
        cloned.physicSkills = new PhysicSkills(physicSkills.levelOfSkills);
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "commonSkills=" + commonSkills +
                ", physicSkills=" + physicSkills +
                ", hashCode=" + hashCode() +
                '}';
    }
}
