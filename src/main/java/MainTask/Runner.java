package MainTask;

import MainTask.Cars.Car;
import MainTask.Cars.*;
import MainTask.models.*;


import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Car> cars = Arrays.asList(
            new businessCar(10000,20,100,200,carType.SEDAN, businessModel.BMW),
            new economyCar(10000,30,120,190,carType.SEDAN,economyModel.SKODA),
            new comfortCar(10000,25,110,195,carType.HATCHBACK,comfortModel.TOYOTA),
            new businessCar(15000,10,130,205,carType.LIFTBACK,businessModel.AUDI)
    );

    public static void main(String[] args) {
        int LeftBorder = 199;
        int RightBorder = 210;
        TaxiStation taxiStation = new TaxiStation(cars);
        System.out.println("Стоимость таксопарка "+taxiStation.getTaxiStationPrice()+"$");
        System.out.println("Сортировка автомобилей по расходу топлива: \n"+taxiStation.sortByFuelConsumption().toString());
        System.out.println("Автомобили соответствующие диапозону скорости ("+LeftBorder+","+RightBorder+")\n"+taxiStation.getCarWithMaxSpeedRange(LeftBorder,RightBorder));
    }
}