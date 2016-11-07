package lesson2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by admin on 07.11.2016.
 */
public class EmpTest {

    @Test
    public void testSort() {
        Employee[] actual = {new Boss(120_000), new Worker(90_000),
                new Manager(110_000), new LeadingWorker(100_000)};

        Arrays.sort(actual);

        Employee[] expected = {new Worker(90_000), new LeadingWorker(100_000),
                new Manager(110_000), new Boss(120_000)};

        for (int i = 0; i < actual.length; i++) {
            Assert.assertEquals(expected[i].salary, actual[i].salary);
        }
    }
}
