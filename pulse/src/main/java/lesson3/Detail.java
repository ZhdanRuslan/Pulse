package lesson3;

/**
 * Created by admin on 09.11.2016.
 */
public class Detail implements Cloneable{
    private double cost;
    private String name;
    private Employee manufacturer;

    public Detail(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Employee manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    protected Detail clone() throws CloneNotSupportedException {
        return  (Detail) super.clone();
    }
}
