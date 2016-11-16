package lesson4;

public class Employee {

    Unit addDetail(Unit unit, Detail... det) {
        unit.pushDetail(det);
        return unit;
    }
}
