/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio2.dto.Lab2HistorialPaciantesDTO;

/**
 *
 * @author Bosco
 */
public interface ILab2HistorialPacientesService {
    public Optional<List<Lab2HistorialPaciantesDTO>> findAll();

    public Optional<Lab2HistorialPaciantesDTO> findById(Long id);

    public Lab2HistorialPaciantesDTO create(Lab2HistorialPaciantesDTO usuario);

    public Optional<Lab2HistorialPaciantesDTO> update(Lab2HistorialPaciantesDTO usuario, Long id);
}
