package pp5.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pp5.respositories.CarRepository;

/**
 * Created by Rafał on 2016-02-18.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String getCars(Model model) {
        model.addAttribute("cars", carRepository.findByIdLessThan(4));
        return "index";
    }
}
