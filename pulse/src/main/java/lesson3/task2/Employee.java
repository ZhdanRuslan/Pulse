package lesson3.task2;

/**
 * Created by admin on 10.11.2016.
 */
public abstract class Employee implements Teachable {

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
        protected CommonSkills clone() throws CloneNotSupportedException {
            CommonSkills commonSkills = (CommonSkills) super.clone();
            return commonSkills;
        }

        @Override
        public String toString() {
            return "CommonSkills{" +
                    "levelOfSkills=" + levelOfSkills +
                    "hashCode=" + Employee.this.hashCode() +
                    '}';
        }
    }

    private class PhysicSkills implements Cloneable{

        private double levelOfSkills;

        private PhysicSkills() {
            this.levelOfSkills = 0.00;
        }

        private PhysicSkills(double levelOfSkills) {
            this.levelOfSkills = levelOfSkills;
        }

        @Override
        protected PhysicSkills clone() throws CloneNotSupportedException {
            PhysicSkills physicSkills = (PhysicSkills) super.clone();
            return physicSkills;
        }

        @Override
        public String toString() {
            return "PhysicSkills{" +
                    "levelOfSkills=" + levelOfSkills +
                    "hashCode=" + Employee.this.hashCode() +
                    '}';
        }
    }


    public CommonSkills getCommonSkills() {
        return commonSkills;
    }

    public void setCommonSkills(CommonSkills commonSkills) {
        this.commonSkills = commonSkills;
    }

    public PhysicSkills getPhysicSkills() {
        return physicSkills;
    }

    public void setPhysicSkills(PhysicSkills physicSkills) {
        this.physicSkills = physicSkills;
    }

    @Override
    public Employee teachSomeone(Employee target) throws CloneNotSupportedException {
        CommonSkills commonSkills = this.commonSkills.clone();
        PhysicSkills physicSkills = this.physicSkills.clone();
        target.setCommonSkills(commonSkills);
        target.setPhysicSkills(physicSkills);
        return target;
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
