package lesson4.task1;

public class Employee {

    Unit addDetail(Unit unit, Detail... det) {
        unit.pushDetail(det);
        return unit;
    }
}
