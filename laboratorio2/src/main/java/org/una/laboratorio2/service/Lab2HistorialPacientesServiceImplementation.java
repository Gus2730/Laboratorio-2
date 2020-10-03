/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.laboratorio2.dto.Lab2HistorialPaciantesDTO;
import org.una.laboratorio2.entities.Lab2HistorialPaciantes;
import org.una.laboratorio2.repositories.ILab2HistorialPacientesRepository;
import org.una.laboratorio2.utils.ConversionLista;
import org.una.laboratorio2.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class Lab2HistorialPacientesServiceImplementation implements ILab2HistorialPacientesService{

    @Autowired
    private ILab2HistorialPacientesRepository ILab2HistorialPacientesRepository;

    @Transactional(readOnly = true)
    @Override
    public Optional<List<Lab2HistorialPaciantesDTO>> findAll() {
       return (Optional<List<Lab2HistorialPaciantesDTO>>) ConversionLista.findList((ILab2HistorialPacientesRepository.findAll()),Lab2HistorialPaciantesDTO.class);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Lab2HistorialPaciantesDTO> findById(Long id) {
        return (Optional<Lab2HistorialPaciantesDTO>)ConversionLista.oneToDto(ILab2HistorialPacientesRepository.findById(id),Lab2HistorialPaciantesDTO.class);
    }
    
    @Override
    @Transactional
    public Lab2HistorialPaciantesDTO create(Lab2HistorialPaciantesDTO Lab2HistorialPaciantes) {
        Lab2HistorialPaciantes pac = MapperUtils.EntityFromDto(Lab2HistorialPaciantes, Lab2HistorialPaciantes.class);
        pac = ILab2HistorialPacientesRepository.save(pac);
        return MapperUtils.DtoFromEntity(pac, Lab2HistorialPaciantesDTO.class);
    }

    @Override
    @Transactional
    public Optional<Lab2HistorialPaciantesDTO> update(Lab2HistorialPaciantesDTO Lab2HistorialPaciantesDTO, Long id) {
        if (ILab2HistorialPacientesRepository.findById(id).isPresent()) {
            Lab2HistorialPaciantes user = MapperUtils.EntityFromDto(Lab2HistorialPaciantesDTO, Lab2HistorialPaciantes.class);
            user = ILab2HistorialPacientesRepository.save(user);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(user, Lab2HistorialPaciantesDTO.class));
        } else {
            return null;
        }
    }
    
}
