package MainTask.Cars;

import MainTask.models.carType;
import MainTask.models.comfortModel;

import java.util.Objects;

public class comfortCar extends Car{

    private comfortModel comfortModel;


    public comfortCar(int dollarPrice, int fuelConsumption, int Horsepower, int maxSpeed, carType carType,comfortModel comfortModel) {
        super(dollarPrice, fuelConsumption, Horsepower, maxSpeed, carType);
        this.comfortModel = comfortModel;
    }

    public MainTask.models.comfortModel getComfortModel() {
        return comfortModel;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", comfortModel=" + comfortModel +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof comfortCar)) return false;
        if (!super.equals(o)) return false;
        comfortCar that = (comfortCar) o;
        return comfortModel == that.comfortModel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), comfortModel);
    }
}
