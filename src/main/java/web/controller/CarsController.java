package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Objects;

@Controller
public class CarsController {


    CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String Car(@RequestParam(value = "count",required = false) Integer count, ModelMap modelMap){
        modelMap.addAttribute("cars",carService.getCars(Objects.requireNonNullElse(count,5)));
        return "cars";
    }
}
