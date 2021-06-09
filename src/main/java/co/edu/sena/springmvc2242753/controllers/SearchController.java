package co.edu.sena.springmvc2242753.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class SearchController {

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model)
    {
        System.out.println("Esta en search controller");
        System.out.println("Criterio de búsqueda: "+search);
        return "search";
    }


}
