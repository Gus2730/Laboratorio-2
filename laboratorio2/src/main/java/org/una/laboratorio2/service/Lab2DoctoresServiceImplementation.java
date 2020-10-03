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
import org.una.laboratorio2.dto.Lab2DoctoresDTO;
import org.una.laboratorio2.entities.Lab2Doctores;
import org.una.laboratorio2.repositories.ILab2DoctoresRepository;
import org.una.laboratorio2.utils.ConversionLista;
import org.una.laboratorio2.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class Lab2DoctoresServiceImplementation implements ILab2DoctoresService{
    
    @Autowired
    private ILab2DoctoresRepository ILab2DoctorRepository;
    

    @Override
    @Transactional(readOnly = true)
    public Optional<List<Lab2DoctoresDTO>> findAll() {
        return (Optional<List<Lab2DoctoresDTO>>) ConversionLista.findList((ILab2DoctorRepository.findAll()),Lab2DoctoresDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Lab2DoctoresDTO> findById(Long id) {
        return (Optional<Lab2DoctoresDTO>)ConversionLista.oneToDto(ILab2DoctorRepository.findById(id),Lab2DoctoresDTO.class);
    }


    @Override
    @Transactional
    public Lab2DoctoresDTO create(Lab2DoctoresDTO lab2Doctores) {
        Lab2Doctores doc = MapperUtils.EntityFromDto(lab2Doctores, Lab2Doctores.class);
        doc = ILab2DoctorRepository.save(doc);
        return MapperUtils.DtoFromEntity(doc, Lab2DoctoresDTO.class);
    }

    @Override
    @Transactional
    public Optional<Lab2DoctoresDTO> update(Lab2DoctoresDTO usuario, Long id) {
        if (ILab2DoctorRepository.findById(id).isPresent()) {
            Lab2Doctores user = MapperUtils.EntityFromDto(usuario, Lab2Doctores.class);
            user = ILab2DoctorRepository.save(user);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(user, Lab2DoctoresDTO.class));
        } else {
            return null;
        }

    }
}
