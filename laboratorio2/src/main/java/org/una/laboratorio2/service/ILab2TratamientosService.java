package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio2.dto.Lab2TratamientosDTO;

/**
 *
 * @author Bosco
 */
public interface ILab2TratamientosService {

    public Optional<List<Lab2TratamientosDTO>> findAll();

    public Optional<Lab2TratamientosDTO> findById(Long id);

    public Lab2TratamientosDTO create(Lab2TratamientosDTO tratamiento);

    public Optional<Lab2TratamientosDTO> update(Lab2TratamientosDTO tratamiento, Long id);
}
