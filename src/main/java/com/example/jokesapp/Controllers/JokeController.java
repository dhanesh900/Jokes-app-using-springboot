package com.example.jokesapp.Controllers;

import com.example.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    @Autowired
    private JokesService jokesService;
    @RequestMapping({"/",""})
    public String ShowJoke(Model model)
    {
        model.addAttribute("joke",jokesService.getJoke());
        return "index";
    }
}
