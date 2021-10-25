package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
public class CarsController {
    @Autowired
    private CarService service;
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "number", required = false) Optional<Integer> number, Model model){
        model.addAttribute("cars", service.getCars(number.orElse(0)));
        return "/cars";
    }
}
