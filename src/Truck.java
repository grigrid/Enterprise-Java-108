public class Truck extends Car {
    private int towingCapacity;

    public Truck(int vinNumber, String make, String model, double mileage) {
        super(vinNumber, make, model, mileage);
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
