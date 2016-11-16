package lesson4.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 16.11.2016.
 */
public class Unit {

    private List<Detail> details = new ArrayList<>();

    public Unit addDetail(Detail... detail) {
        for (int i = 0; i < detail.length; i++)
            details.add(i, detail[i]);
        return this;
    }
}
