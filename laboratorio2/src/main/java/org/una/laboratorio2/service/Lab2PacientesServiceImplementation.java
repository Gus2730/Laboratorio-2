/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.laboratorio2.dto.Lab2PacientesDTO;
import org.una.laboratorio2.entities.Lab2Doctores;
import org.una.laboratorio2.entities.Lab2Pacientes;
import org.una.laboratorio2.repositories.ILab2PacientesRepository;
import org.una.laboratorio2.utils.ConversionLista;
import org.una.laboratorio2.utils.MapperUtils;

/**
 *
 * @author Bosco
 */

@Service
public class Lab2PacientesServiceImplementation implements ILab2PacientesService{
    
    @Autowired
    private ILab2PacientesRepository ILab2PacientesRepository;

    @Transactional(readOnly = true)
    @Override
    public Optional<List<Lab2PacientesDTO>> findAll() {
       return (Optional<List<Lab2PacientesDTO>>) ConversionLista.findList((ILab2PacientesRepository.findAll()),Lab2PacientesDTO.class);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Lab2PacientesDTO> findById(Long id) {
        return (Optional<Lab2PacientesDTO>)ConversionLista.oneToDto(ILab2PacientesRepository.findById(id),Lab2PacientesDTO.class);
    }

    @Override
    @Transactional
    public Lab2PacientesDTO create(Lab2PacientesDTO Lab2Pacientes) {
        Lab2Pacientes pac = MapperUtils.EntityFromDto(Lab2Pacientes, Lab2Pacientes.class);
        pac = ILab2PacientesRepository.save(pac);
        return MapperUtils.DtoFromEntity(pac, Lab2PacientesDTO.class);
    }

    @Override
    @Transactional
    public Optional<Lab2PacientesDTO> update(Lab2PacientesDTO Lab2Pacientes, Long id) {
        if (ILab2PacientesRepository.findById(id).isPresent()) {
            Lab2Pacientes user = MapperUtils.EntityFromDto(Lab2Pacientes, Lab2Pacientes.class);
            user = ILab2PacientesRepository.save(user);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(user, Lab2PacientesDTO.class));
        } else {
            return null;
        }
    }
    
}
