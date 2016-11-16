package lesson4;

import java.util.ArrayList;
import java.util.List;

class Unit {

    private List<Detail> details = new ArrayList<>();

    void pushDetail(Detail... det) {
        int index = details.size();
        for (Detail d : det) {
            details.add(index++, d);
        }
        System.out.println(details);
    }
}
