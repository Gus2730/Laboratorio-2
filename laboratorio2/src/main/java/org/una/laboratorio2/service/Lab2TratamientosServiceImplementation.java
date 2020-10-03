/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.laboratorio2.dto.Lab2TratamientosDTO;
import org.una.laboratorio2.entities.Lab2Doctores;
import org.una.laboratorio2.entities.Lab2Tratamientos;
import org.una.laboratorio2.repositories.ILab2TratamientosRepository;
import org.una.laboratorio2.utils.ConversionLista;
import org.una.laboratorio2.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class Lab2TratamientosServiceImplementation implements ILab2TratamientosService{

    @Autowired
    private ILab2TratamientosRepository ILab2TratamientosRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<Lab2TratamientosDTO>> findAll() {
        return (Optional<List<Lab2TratamientosDTO>>) ConversionLista.findList((ILab2TratamientosRepository.findAll()),Lab2TratamientosDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Lab2TratamientosDTO> findById(Long id) {
        return (Optional<Lab2TratamientosDTO>)ConversionLista.oneToDto(ILab2TratamientosRepository.findById(id),Lab2TratamientosDTO.class);
    }

    @Override
    public Lab2TratamientosDTO create(Lab2TratamientosDTO tratamiento) {
        Lab2Tratamientos doc = MapperUtils.EntityFromDto(tratamiento, Lab2Tratamientos.class);
        doc = ILab2TratamientosRepository.save(doc);
        return MapperUtils.DtoFromEntity(doc, Lab2TratamientosDTO.class);
    }

    @Override
    public Optional<Lab2TratamientosDTO> update(Lab2TratamientosDTO tratamiento, Long id) {
        if (ILab2TratamientosRepository.findById(id).isPresent()) {
            Lab2Tratamientos user = MapperUtils.EntityFromDto(tratamiento, Lab2Tratamientos.class);
            user = ILab2TratamientosRepository.save(user);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(user, Lab2TratamientosDTO.class));
        } else {
            return null;
        }
    }
    
    
    
}
