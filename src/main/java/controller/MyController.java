package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cont")
public class MyController {

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ModelAndView get(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view");
        modelAndView.addObject("String", "Hello world");
        return modelAndView;
    }
}
