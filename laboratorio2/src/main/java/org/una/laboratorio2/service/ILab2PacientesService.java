package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio2.dto.Lab2PacientesDTO;

/**
 *
 * @author Bosco
 */
public interface ILab2PacientesService {

    public Optional<List<Lab2PacientesDTO>> findAll();

    public Optional<Lab2PacientesDTO> findById(Long id);

    public Lab2PacientesDTO create(Lab2PacientesDTO paciente);

    public Optional<Lab2PacientesDTO> update(Lab2PacientesDTO paciente, Long id);
}
