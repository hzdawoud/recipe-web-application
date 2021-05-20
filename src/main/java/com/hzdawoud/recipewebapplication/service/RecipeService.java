package com.hzdawoud.recipewebapplication.service;

import com.hzdawoud.recipewebapplication.command.RecipeCommand;
import com.hzdawoud.recipewebapplication.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
