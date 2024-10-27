package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String showCountCars(ModelMap model, @RequestParam(required = false) Integer count) {
        model.addAttribute("cars", carService.showCountCar(count));
        model.addAttribute("count", count);
        return "car";
    }
}
