package lesson3.task1;

import lesson3.task1.ability.Creatable;

import java.util.Random;

/**
 * Created by admin on 09.11.2016.
 */
public abstract class Employee implements Creatable{

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    static Random random = new Random();

    @Override
    public Detail createDetail(Detail etalon) throws CloneNotSupportedException, BadDetailException {

        int probability = random.nextInt(100);
        if (probability>94)
            throw new BadDetailException();
        Detail result = etalon.clone();
        result.setManufacturer(this);
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
