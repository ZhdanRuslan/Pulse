package lesson3.task2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 10.11.2016.
 */
public class TestApp2 {


    @Test
    public void testClone(){
        Master master = new Master(98.00, 75.00);
        Trainee trainee = new Trainee();

        try {
            master.teachSomeone(trainee);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Assert.assertNotSame(master, trainee);
//        Assert.assertEquals(master.);
    }
}
