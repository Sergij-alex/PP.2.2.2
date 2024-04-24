package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiseImpl implements CarServise {

    private final CarsDaoImp carsDao;

    @Autowired
    public CarServiseImpl(CarsDaoImp carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getCars(int a) {
        List<Car> cars = carsDao.getAllCars();

        if (a >= cars.size()) {
            a = cars.size();
        }
        if (a < 0) {
            a = 0;
        }

        return cars.subList(0, a);
    }
}
