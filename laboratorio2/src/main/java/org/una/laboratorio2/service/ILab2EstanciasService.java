package org.una.laboratorio2.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.una.laboratorio2.dto.Lab2EstanciasDTO;

/**
 *
 * @author Bosco
 */
public interface ILab2EstanciasService {

    public Optional<List<Lab2EstanciasDTO>> findAll();

    public Optional<Lab2EstanciasDTO> findById(Long id);

    public Lab2EstanciasDTO create(Lab2EstanciasDTO estancia);

    public Optional<Lab2EstanciasDTO> update(Lab2EstanciasDTO estancia, Long id);

    public Optional<List<Lab2EstanciasDTO>> findByCodigoDoctor(String codigo);

    public Optional<List<Lab2EstanciasDTO>> findByTratamientoCodigo(String codigo);
}
