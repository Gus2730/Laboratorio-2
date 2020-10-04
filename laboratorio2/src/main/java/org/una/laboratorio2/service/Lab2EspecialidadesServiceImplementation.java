package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.laboratorio2.dto.Lab2EspecialidadesDTO;
import org.una.laboratorio2.entities.Lab2Especialidades;
import org.una.laboratorio2.repositories.ILab2EspecialidadesRepository;
import org.una.laboratorio2.utils.ConversionLista;
import org.una.laboratorio2.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class Lab2EspecialidadesServiceImplementation implements ILab2EspecialidadesService {

    @Autowired
    private ILab2EspecialidadesRepository ILab2EspecialidadesRepository;

    @Transactional(readOnly = true)
    @Override
    public Optional<List<Lab2EspecialidadesDTO>> findAll() {
        return (Optional<List<Lab2EspecialidadesDTO>>) ConversionLista.findList((ILab2EspecialidadesRepository.findAll()), Lab2EspecialidadesDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Lab2EspecialidadesDTO> findById(Long id) {
        return (Optional<Lab2EspecialidadesDTO>) ConversionLista.oneToDto(ILab2EspecialidadesRepository.findById(id), Lab2EspecialidadesDTO.class);
    }

    @Override
    public Lab2EspecialidadesDTO create(Lab2EspecialidadesDTO especialidad) {
        Lab2Especialidades pac = MapperUtils.EntityFromDto(especialidad, Lab2Especialidades.class);
        pac = ILab2EspecialidadesRepository.save(pac);
        return MapperUtils.DtoFromEntity(pac, Lab2EspecialidadesDTO.class);
    }

    @Override
    public Optional<Lab2EspecialidadesDTO> update(Lab2EspecialidadesDTO especialidad, Long id) {
        if (ILab2EspecialidadesRepository.findById(id).isPresent()) {
            Lab2Especialidades user = MapperUtils.EntityFromDto(especialidad, Lab2Especialidades.class);
            user = ILab2EspecialidadesRepository.save(user);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(user, Lab2EspecialidadesDTO.class));
        } else {
            return null;
        }
    }

}
