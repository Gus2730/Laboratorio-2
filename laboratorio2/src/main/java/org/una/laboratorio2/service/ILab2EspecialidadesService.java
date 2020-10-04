package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio2.dto.Lab2EspecialidadesDTO;

/**
 *
 * @author Bosco
 */
public interface ILab2EspecialidadesService {

    public Optional<List<Lab2EspecialidadesDTO>> findAll();

    public Optional<Lab2EspecialidadesDTO> findById(Long id);

    public Lab2EspecialidadesDTO create(Lab2EspecialidadesDTO especialidad);

    public Optional<Lab2EspecialidadesDTO> update(Lab2EspecialidadesDTO especialidad, Long id);
}
