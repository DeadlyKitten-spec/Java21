public class Car implements Comparable<Car>{
    private int manufactureYear;
    private String model;
    private int maxSpeed;

    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }


    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int compareTo(Car o) {
        if (this.getManufactureYear() - o.getManufactureYear() == 0) {
            return this.getMaxSpeed() - o.getMaxSpeed();
        } else {
            return this.getManufactureYear() - o.getManufactureYear();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactureYear=" + manufactureYear +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
