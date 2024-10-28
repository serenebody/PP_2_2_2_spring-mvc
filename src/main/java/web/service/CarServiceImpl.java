package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    private List<Car> car;
    {
        car = new ArrayList<>();
        car.add(new Car(++CARS_COUNT, "BMW", "hatchback", "2.0L"));
        car.add(new Car(++CARS_COUNT, "AUDI", "sedan", "1.8L"));
        car.add(new Car(++CARS_COUNT, "HONDA", "crossover", "2.1L"));
        car.add(new Car(++CARS_COUNT, "LADA", "sedan", "1.6L"));
        car.add(new Car(++CARS_COUNT, "FORD", "universal", "1.6L"));
        car.add(new Car(++CARS_COUNT, "MITSUBISHI", "sedan", "1.9L"));
    }

    @Override
    public List<Car> showCountCar(Integer count) {
        if (count == null || count >= car.size()) {
            return car;
        }
        return car.stream().limit(count).collect(Collectors.toList());
    }
}
