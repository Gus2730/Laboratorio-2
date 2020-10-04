package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio2.dto.Lab2UnidadesDTO;

/**
 *
 * @author Bosco
 */
public interface ILab2UnidadesService {

    public Optional<List<Lab2UnidadesDTO>> findAll();

    public Optional<Lab2UnidadesDTO> findById(Long id);

    public Lab2UnidadesDTO create(Lab2UnidadesDTO unidad);

    public Optional<Lab2UnidadesDTO> update(Lab2UnidadesDTO unidad, Long id);

    public Optional<List<Lab2UnidadesDTO>> findByUnidadDoctorEspecialidadId(String nombre);
}
