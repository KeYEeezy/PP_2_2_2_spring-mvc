package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> returnAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW-525", "Black", 222));
        cars.add(new Car("Mercedes-E-220", "Red", 240));
        cars.add(new Car("Honda-Accord", "Pink", 270));
        cars.add(new Car("Infinity-QX-57", "Gold", 220));
        cars.add(new Car("Lada-Vesta", "Yellow", 170));
        return cars;
    }

    public List<Car> returnCarsbyindex(Integer i) {

        return returnAllCars().stream().limit(i).collect(Collectors.toList());
    }
}
