package lesson2;

import lesson2.interfaces.Cleanable;
import lesson2.interfaces.Signable;

/**
 * Created by admin on 06.11.2016.
 */
public class Employee {
    protected Signable signableDelegate = null;
    protected Cleanable cleanableDelegate = null;
}
