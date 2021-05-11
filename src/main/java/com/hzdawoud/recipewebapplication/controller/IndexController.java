package com.hzdawoud.recipewebapplication.controller;

import com.hzdawoud.recipewebapplication.domain.Category;
import com.hzdawoud.recipewebapplication.domain.UnitOfMeasure;
import com.hzdawoud.recipewebapplication.repository.CategoryRepository;
import com.hzdawoud.recipewebapplication.repository.UnitMeasureRepository;
import com.hzdawoud.recipewebapplication.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }



    @RequestMapping("/index")
    public String getIndexPage(Model model) {
        model.addAttribute(recipeService.getRecipes());

        return "index";
    }
}
