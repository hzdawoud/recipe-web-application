package com.hzdawoud.recipewebapplication.service;

import com.hzdawoud.recipewebapplication.command.IngredientCommand;
import com.hzdawoud.recipewebapplication.domain.Ingredient;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
