/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio2.dto.Lab2IntervencionesDTO;

/**
 *
 * @author Bosco
 */
public interface ILab2IntervencionesService {
    public Optional<List<Lab2IntervencionesDTO>> findAll();

    public Optional<Lab2IntervencionesDTO> findById(Long id);

    public Lab2IntervencionesDTO create(Lab2IntervencionesDTO intervencion);

    public Optional<Lab2IntervencionesDTO> update(Lab2IntervencionesDTO intervencion, Long id);
}
