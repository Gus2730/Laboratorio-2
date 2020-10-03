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
import org.una.laboratorio2.dto.Lab2EstanciasDTO;
import org.una.laboratorio2.entities.Lab2Estancias;
import org.una.laboratorio2.repositories.ILab2EstanciasRepository;
import org.una.laboratorio2.utils.ConversionLista;
import org.una.laboratorio2.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class Lab2EstanciasServiceImplementation implements ILab2EstanciasService{

    @Autowired
    private ILab2EstanciasRepository ILab2EstanciasRepository;
    
    @Transactional(readOnly = true)
    @Override
    public Optional<List<Lab2EstanciasDTO>> findAll() {
       return (Optional<List<Lab2EstanciasDTO>>) ConversionLista.findList((ILab2EstanciasRepository.findAll()),Lab2EstanciasDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Lab2EstanciasDTO> findById(Long id) {
        return (Optional<Lab2EstanciasDTO>)ConversionLista.oneToDto(ILab2EstanciasRepository.findById(id),Lab2EstanciasDTO.class);
    }

    @Override
    public Lab2EstanciasDTO create(Lab2EstanciasDTO estancia) {
        Lab2Estancias doc = MapperUtils.EntityFromDto(estancia, Lab2Estancias.class);
        doc = ILab2EstanciasRepository.save(doc);
        return MapperUtils.DtoFromEntity(doc, Lab2EstanciasDTO.class);
    }

    @Override
    public Optional<Lab2EstanciasDTO> update(Lab2EstanciasDTO estancia, Long id) {
        if (ILab2EstanciasRepository.findById(id).isPresent()) {
            Lab2Estancias user = MapperUtils.EntityFromDto(estancia, Lab2Estancias.class);
            user = ILab2EstanciasRepository.save(user);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(user, Lab2EstanciasDTO.class));
        } else {
            return null;
        }
    }
    
}
