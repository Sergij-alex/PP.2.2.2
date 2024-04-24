package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CarsDaoImp implements CarsDao{

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Audi", "green", 123));
        cars.add(new Car("Toyota", "white", 1234));
        cars.add(new Car("Cherrocke", "black", 12345));
        cars.add(new Car("Zhiguli", "yellow", 123456));
        cars.add(new Car("Chevralet", "red", 1234567));

    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}