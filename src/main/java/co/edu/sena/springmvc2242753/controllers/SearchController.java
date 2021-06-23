package co.edu.sena.springmvc2242753.controllers;

import co.edu.sena.springmvc2242753.beans.Product;
import co.edu.sena.springmvc2242753.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("ALL")
@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model)
    {
        System.out.println("Esta en search controller");
        System.out.println("Criterio de búsqueda: "+search);

        List<Product> products = new ArrayList<>();
        products = productRepository.searchByName(search);
        model.addAttribute("products", products);


        return "search";
    }




}
