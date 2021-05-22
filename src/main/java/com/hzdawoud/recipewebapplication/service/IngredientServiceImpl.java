package com.hzdawoud.recipewebapplication.service;

import com.hzdawoud.recipewebapplication.command.IngredientCommand;
import com.hzdawoud.recipewebapplication.converter.IngredientToIngredientCommand;
import com.hzdawoud.recipewebapplication.domain.Recipe;
import com.hzdawoud.recipewebapplication.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class IngredientServiceImpl implements IngredientService {

    private final IngredientToIngredientCommand converter;
    private final RecipeRepository repository;

    public IngredientServiceImpl(IngredientToIngredientCommand converter, RecipeRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId) {
        Optional<Recipe> recipeOptional = repository.findById(recipeId);

        if (!recipeOptional.isPresent()) {
            log.error("recipe id not found!");
        }

        Recipe recipe = recipeOptional.get();

        Optional<IngredientCommand> ingredientCommandOptional = recipe.getIngredients().stream()
                .filter(ingredient -> ingredient.getId().equals(ingredientId))
                .map(converter::convert).findFirst();

        if (!ingredientCommandOptional.isPresent()) {
            log.error("ingredient id not found!");
        }

        return ingredientCommandOptional.get();
    }
}
