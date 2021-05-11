package com.hzdawoud.recipewebapplication.repository;

import com.hzdawoud.recipewebapplication.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String Description);
}
