package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarsDao {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Audi", "green", 123));
        cars.add(new Car("Toyota", "white", 1234));
        cars.add(new Car("Cherrocke", "black", 12345));
        cars.add(new Car("Zhiguli", "yellow", 123456));
        cars.add(new Car("Chevralet", "red", 1234567));

    }

    public List<Car> getAllCars() {
        return cars;
    }
}