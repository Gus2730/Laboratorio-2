/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.service;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio2.dto.Lab2DoctoresDTO;
/**
 *
 * @author Bosco
 */
public interface ILab2DoctoresService {
    public Optional<List<Lab2DoctoresDTO>> findAll();

    public Optional<Lab2DoctoresDTO> findById(Long id);

    public Lab2DoctoresDTO create(Lab2DoctoresDTO doctor);

    public Optional<Lab2DoctoresDTO> update(Lab2DoctoresDTO doctor, Long id);

}
