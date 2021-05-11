package com.hzdawoud.recipewebapplication.repository;

import com.hzdawoud.recipewebapplication.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String Description);
}
