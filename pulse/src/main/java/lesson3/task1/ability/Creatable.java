package lesson3.task1.ability;

import lesson3.task1.BadDetailException;
import lesson3.task1.Detail;

/**
 * Created by admin on 09.11.2016.
 */
public interface Creatable {
    public Detail createDetail (Detail etalon) throws CloneNotSupportedException, BadDetailException;
}
