/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.una.laboratorio2.entities.Lab2HistorialPaciantes;

/**
 *
 * @author colo7
 */
public interface ILab2HistorialPacientesRepository extends JpaRepository<Lab2HistorialPaciantes, Long>{
    
}