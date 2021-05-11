package com.hzdawoud.recipewebapplication.repository;

import com.hzdawoud.recipewebapplication.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
