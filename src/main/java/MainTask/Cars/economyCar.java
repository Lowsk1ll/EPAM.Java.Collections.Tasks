package MainTask.Cars;

import MainTask.models.carType;
import MainTask.models.economyModel;

import java.util.Objects;

public class economyCar extends Car{

    private economyModel economyModel;

    public economyCar(int dollarPrice, int fuelConsumption, int Horsepower, int maxSpeed, carType carType,economyModel economyModel) {
        super(dollarPrice, fuelConsumption, Horsepower, maxSpeed, carType);
        this.economyModel = economyModel;
    }

    public MainTask.models.economyModel getEconomyModel() {
        return economyModel;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",", economyModel=" + economyModel +'\'' +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof economyCar)) return false;
        if (!super.equals(o)) return false;
        economyCar that = (economyCar) o;
        return economyModel == that.economyModel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), economyModel);
    }
}
