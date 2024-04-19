package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServise;

import java.util.List;

@Controller
public class CarsController {

    private final CarServise carServus;

    @Autowired
    public CarsController(CarServise carServus) {
        this.carServus = carServus;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(Model model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = carServus.getCars(count);
        model.addAttribute("carss", cars);
        return "cars";
    }
}
