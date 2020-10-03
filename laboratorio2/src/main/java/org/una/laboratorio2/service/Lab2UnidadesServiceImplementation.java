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
import org.una.laboratorio2.dto.Lab2UnidadesDTO;
import org.una.laboratorio2.entities.Lab2Pacientes;
import org.una.laboratorio2.entities.Lab2Unidades;
import org.una.laboratorio2.repositories.ILab2UnidadesRepository;
import org.una.laboratorio2.utils.ConversionLista;
import org.una.laboratorio2.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class Lab2UnidadesServiceImplementation implements ILab2UnidadesService {

    @Autowired
    private ILab2UnidadesRepository ILab2UnidadesRepository;

    @Transactional(readOnly = true)
    @Override
    public Optional<List<Lab2UnidadesDTO>> findAll() {
        return (Optional<List<Lab2UnidadesDTO>>) ConversionLista.findList((ILab2UnidadesRepository.findAll()), Lab2UnidadesDTO.class);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Lab2UnidadesDTO> findById(Long id) {
        return (Optional<Lab2UnidadesDTO>) ConversionLista.oneToDto(ILab2UnidadesRepository.findById(id), Lab2UnidadesDTO.class);
    }

    @Override
    @Transactional
    public Lab2UnidadesDTO create(Lab2UnidadesDTO Lab2UnidadesDTO) {
        Lab2Unidades pac = MapperUtils.EntityFromDto(Lab2UnidadesDTO, Lab2Unidades.class);
        pac = ILab2UnidadesRepository.save(pac);
        return MapperUtils.DtoFromEntity(pac, Lab2UnidadesDTO.class);
    }

    @Override
    @Transactional
    public Optional<Lab2UnidadesDTO> update(Lab2UnidadesDTO usuario, Long id) {
        if (ILab2UnidadesRepository.findById(id).isPresent()) {
            Lab2Unidades user = MapperUtils.EntityFromDto(ILab2UnidadesRepository, Lab2Unidades.class);
            user = ILab2UnidadesRepository.save(user);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(user, Lab2UnidadesDTO.class));
        } else {
            return null;
        }
    }

}
