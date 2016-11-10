package lesson3.task1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 10.11.2016.
 */
public class TestApp1 {

    @Test
    public void testDetailCreating(){
        Detail etalon = new Detail(12.55, "Hammer");
        Employee etalonWorker = new Worker("Petia");
        etalon.setManufacturer(etalonWorker);
        Employee worker = new Worker("Petia");

        Detail createdDetail = null;
        try {
            createdDetail = worker.createDetail(etalon);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (BadDetailException e) {
            /**
            * Probability to throwing an exception is 95%
            **/
            testDetailCreating();
        }
        Assert.assertNotSame(etalon, createdDetail);
        Assert.assertEquals(etalon.getCost(), createdDetail.getCost(), 0);
        Assert.assertEquals(etalon.getName(), createdDetail.getName());
    }
}
