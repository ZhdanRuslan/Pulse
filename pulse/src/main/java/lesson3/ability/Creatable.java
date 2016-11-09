package lesson3.ability;

import lesson3.Detail;

/**
 * Created by admin on 09.11.2016.
 */
public interface Creatable {
    public Detail createDetail (Detail etalon) throws CloneNotSupportedException;
}
