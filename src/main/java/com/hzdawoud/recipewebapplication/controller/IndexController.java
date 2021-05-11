package com.hzdawoud.recipewebapplication.controller;

import com.hzdawoud.recipewebapplication.domain.Category;
import com.hzdawoud.recipewebapplication.domain.UnitOfMeasure;
import com.hzdawoud.recipewebapplication.repository.CategoryRepository;
import com.hzdawoud.recipewebapplication.repository.UnitMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitMeasureRepository unitMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitMeasureRepository unitMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitMeasureRepository = unitMeasureRepository;
    }

    @RequestMapping("/index")
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("Mexican");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitMeasureRepository.findByDescription("Ounce");

        System.out.println(categoryOptional.get().getId());
        System.out.println(unitOfMeasureOptional.get().getId());
        return "index";
    }
}
