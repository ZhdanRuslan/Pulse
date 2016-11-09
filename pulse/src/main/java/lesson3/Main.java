package lesson3;

/**
 * Created by admin on 09.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Detail etalon = new Detail(12.55, "Hammer");
        Employee etalonWorker = new Worker("Petia");
        etalon.setManufacturer(etalonWorker);
        Employee worker = new Worker("Vasia");
        Employee worker2 = new Worker("Sasha");
        Detail result = null;
        Detail result2 = null;
        try {
            result = worker.createDetail(etalon);
            result2 = worker2.createDetail(etalon);
        } catch (CloneNotSupportedException e) {
            System.out.println("Not cloneable");
        } catch (BadDetailException e) {
            System.out.println("Bad detail.");
            return;
        }

//        System.out.println(etalon.getManufacturer());
//        System.out.println(result.getManufacturer());
        System.out.println(etalon);
        System.out.println(result);
        System.out.println(result2);
    }
}
