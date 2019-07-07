package de.c24.finacc.klt.web.controller;

import de.c24.finacc.klt.payload.Person;
import de.c24.finacc.klt.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Index Controller
 */
@Controller
public class IndexController {

    @Autowired
    PersonService personService;
    /**
     * the index page
     * @return ModelAndView for index page.
     */
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("formName", "Anmeldeformular");

        return "index";
    }

    @PostMapping("/checkPerson")
    public String saveCustomer(@ModelAttribute("person") Person person, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl ="http://localhost:5050/klt/api/age";
        ResponseEntity<String> response  = restTemplate.getForEntity(fooResourceUrl + "/26", String.class);
        if(!response.getStatusCode().is2xxSuccessful())
        {
            model.addAttribute("error", "There is system error!");
            return "index";
        }
        String greetingText = response.getBody();
        if(greetingText == "OK" || greetingText =="Funny"){
            personService.savePerson(person);
            return "index";
        }
        model.addAttribute("error", "You can not register to the event!");
        return "index";
    }
}
