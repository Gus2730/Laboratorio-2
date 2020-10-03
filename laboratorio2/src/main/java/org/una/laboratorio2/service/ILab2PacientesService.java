/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public Lab2PacientesDTO create(Lab2PacientesDTO usuario);

    public Optional<Lab2PacientesDTO> update(Lab2PacientesDTO usuario, Long id);
}
