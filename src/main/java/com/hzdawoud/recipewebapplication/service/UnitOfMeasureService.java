package com.hzdawoud.recipewebapplication.service;

import com.hzdawoud.recipewebapplication.command.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUom();
}
