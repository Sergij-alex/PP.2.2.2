package web.servise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarServise {

    @Override
    public List<Car> getCars(int a) {
        Car car = new Car("Audi", "green", 123);
        Car car1 = new Car("Toyota", "white", 1234);
        Car car2 = new Car("Cherrocke", "black", 12345);
        Car car3 = new Car("Zhiguli", "yellow", 123456);
        Car car4 = new Car("Chevralet", "red", 1234567);
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        if (a >= 5) {
            a = 5;
        }
        if (a < 0) {
            a = 0;
        }
        List<Car> cars1 = new ArrayList<>();

        for(int i = 0; i < a; i++) {
            cars1.add(cars.get(i));
        }
        return cars1;
    }
}



