package local.springframework.sfgchucknorris.controllers;

import local.springframework.sfgchucknorris.services.ChuckNorrisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisService service;

    public JokesController(ChuckNorrisService service) {
        this.service = service;
    }

    @RequestMapping(value = {"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", service.getJoke());
        return "chucknorris";
    }
}
