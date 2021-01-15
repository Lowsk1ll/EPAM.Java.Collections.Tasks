package MainTask.Cars;

import MainTask.models.businessModel;
import MainTask.models.carType;

import java.util.Objects;

public class businessCar extends Car{

    private businessModel businessModel;

    public businessCar(int dollarPrice, int fuelConsumption, int horsepower, int maxSpeed, carType carType,businessModel businessModel) {
        super(dollarPrice, fuelConsumption, horsepower, maxSpeed, carType);
        this.businessModel=businessModel;
    }

    public MainTask.models.businessModel getBusinessModel() {
        return businessModel;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",",  businessModel=" + businessModel +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof businessCar)) return false;
        if (!super.equals(o)) return false;
        businessCar that = (businessCar) o;
        return businessModel == that.businessModel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), businessModel);
    }
}
