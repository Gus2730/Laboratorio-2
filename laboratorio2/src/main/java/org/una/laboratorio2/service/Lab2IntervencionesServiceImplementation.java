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
import org.una.laboratorio2.dto.Lab2IntervencionesDTO;
import org.una.laboratorio2.entities.Lab2Intervenciones;
import org.una.laboratorio2.repositories.ILab2IntervencionesRepository;
import org.una.laboratorio2.utils.ConversionLista;
import org.una.laboratorio2.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class Lab2IntervencionesServiceImplementation implements ILab2IntervencionesService{

    @Autowired
    private ILab2IntervencionesRepository ILab2IntervencionesRepository;
    
    @Override
    @Transactional(readOnly = true)
    public Optional<List<Lab2IntervencionesDTO>> findAll() {
        return (Optional<List<Lab2IntervencionesDTO>>) ConversionLista.findList((ILab2IntervencionesRepository.findAll()),Lab2IntervencionesDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Lab2IntervencionesDTO> findById(Long id) {
        return (Optional<Lab2IntervencionesDTO>)ConversionLista.oneToDto(ILab2IntervencionesRepository.findById(id),Lab2IntervencionesDTO.class);
    }

    @Override
    public Lab2IntervencionesDTO create(Lab2IntervencionesDTO intervencion) {
        Lab2Intervenciones doc = MapperUtils.EntityFromDto(intervencion, Lab2Intervenciones.class);
        doc = ILab2IntervencionesRepository.save(doc);
        return MapperUtils.DtoFromEntity(doc, Lab2IntervencionesDTO.class);
    }

    @Override
    public Optional<Lab2IntervencionesDTO> update(Lab2IntervencionesDTO intervencion, Long id) {
        if (ILab2IntervencionesRepository.findById(id).isPresent()) {
            Lab2Intervenciones user = MapperUtils.EntityFromDto(intervencion, Lab2Intervenciones.class);
            user = ILab2IntervencionesRepository.save(user);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(user, Lab2IntervencionesDTO.class));
        } else {
            return null;
        }
    }

    
    
}
