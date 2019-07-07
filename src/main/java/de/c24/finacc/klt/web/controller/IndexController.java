package de.c24.finacc.klt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Index Controller
 */
@Controller
public class IndexController {

    /**
     * the index page
     * @return ModelAndView for index page.
     */
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("formName", "Anmeldeformular");

        return "index";
    }
}
