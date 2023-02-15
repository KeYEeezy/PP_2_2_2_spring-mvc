package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private Integer index;
    private static CarService service = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") String count, Model model) {

        List<Car> cars = new ArrayList<>();

        cars.addAll(service.returnCarsbyindex(Integer.parseInt(count)));

        model.addAttribute("list", cars);

        return "cars";
    }
}
