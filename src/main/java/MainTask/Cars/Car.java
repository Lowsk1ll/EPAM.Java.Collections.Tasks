package MainTask.Cars;
import MainTask.models.carType;

import java.util.Objects;

abstract public class Car {
    private int dollarPrice;
    private int fuelConsumption;
    private int horsepower;
    private int maxSpeed;
    private carType carType;

    public Car(int dollarPrice, int fuelConsumption, int horsepower, int maxSpeed, carType carType) {
        this.dollarPrice = dollarPrice;
        this.fuelConsumption = fuelConsumption;
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
        this.carType = carType;
    }

    public int getDollarPrice() {
        return dollarPrice;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public MainTask.models.carType getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "dollarPrice=" + dollarPrice +
                ", fuelConsumption=" + fuelConsumption +
                ", horsepower=" + horsepower +
                ", maxSpeed=" + maxSpeed +
                ", carType=" + carType +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return dollarPrice == car.dollarPrice &&
                fuelConsumption == car.fuelConsumption &&
                horsepower == car.horsepower &&
                maxSpeed == car.maxSpeed &&
                carType == car.carType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dollarPrice, fuelConsumption, horsepower, maxSpeed, carType);
    }
}
