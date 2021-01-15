package MainTask;

import MainTask.Cars.*;
import MainTask.models.*;

import java.util.*;

public class TaxiStation {
    private List<? extends Car> cars;

    public TaxiStation sortByFuelConsumption(){
        Collections.sort(cars, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.getFuelConsumption()-o2.getFuelConsumption();
            }
        });
        return this;
    }
    public int getTaxiStationPrice(){
        int taxiStationPrice = 0;
        Iterator<? extends Car> iterator = cars.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            taxiStationPrice+=car.getDollarPrice();
        }
        return taxiStationPrice;
    }

    public List<Car> getCarWithMaxSpeedRange(int LeftBorder,int RightBorder){
        List<Car> carsWithMaxSpeedRange = new ArrayList<>();
        for (Car car:cars) {
            if(car.getMaxSpeed()>LeftBorder && car.getMaxSpeed()<RightBorder){
                carsWithMaxSpeedRange.add(car);
            }
        }
        return carsWithMaxSpeedRange;
    }

    @Override
    public String toString() {
        return "TaxiStation{\n" +
                "cars=\n" + cars.toString() +
                '}';
    }

    public TaxiStation(List<? extends Car> cars) {
        this.cars = cars;
    }
}
