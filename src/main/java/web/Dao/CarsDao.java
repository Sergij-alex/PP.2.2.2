package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

@Component
public class CarsDao {

//    public List<Car> getAllCars() {
//        Car car = new Car("Audi", "green", 123);
//        Car car1 = new Car("Toyota", "white", 1234);
//        Car car2 = new Car("Cherokee", "black", 12345);
//        Car car3 = new Car("Zhiguli", "yellow", 123456);
//        Car car4 = new Car("Chevrolet", "red", 1234567);
//
//        List<Car> cars = new ArrayList<>();
//        cars.add(car);
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
//        cars.add(car4);
//
//        return cars;
//    }
//}
    private List<Car> cars;

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