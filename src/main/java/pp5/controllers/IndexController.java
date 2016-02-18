package pp5.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pp5.domain.Car;
import pp5.respositories.CarRepository;

import java.util.List;

/**
 * Created by Rafał on 2016-02-18.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private final CarRepository carRepository;

    @Autowired
    public IndexController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCars(Model model) {
        model.addAttribute("cars", carRepository.findAll());
        return "index";
    }
}
