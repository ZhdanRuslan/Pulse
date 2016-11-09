package lesson3;

/**
 * Created by admin on 09.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Detail etalon = new Detail(12.55, "Hammer");
        Employee worker = new Worker();
        Detail result = null;
        try {
            result = worker.createDetail(etalon);
        } catch (CloneNotSupportedException e) {
            System.out.println("Not cloneable");
        }

        System.out.println(etalon);
        System.out.println(result);
    }
}
