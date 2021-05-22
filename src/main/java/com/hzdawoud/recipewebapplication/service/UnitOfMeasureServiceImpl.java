package com.hzdawoud.recipewebapplication.service;

import com.hzdawoud.recipewebapplication.command.UnitOfMeasureCommand;
import com.hzdawoud.recipewebapplication.converter.UnitOfMeasureToUnitOfMeasureCommand;
import com.hzdawoud.recipewebapplication.repository.UnitMeasureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    private final UnitMeasureRepository unitMeasureRepository;
    private final UnitOfMeasureToUnitOfMeasureCommand converter;

    public UnitOfMeasureServiceImpl(UnitMeasureRepository unitMeasureRepository, UnitOfMeasureToUnitOfMeasureCommand converter) {
        this.unitMeasureRepository = unitMeasureRepository;
        this.converter = converter;
    }


    @Override
    public Set<UnitOfMeasureCommand> listAllUom() {
        return StreamSupport.stream(unitMeasureRepository.findAll()
                .spliterator(),false)
                .map(converter::convert)
                .collect(Collectors.toSet());
    }
}
