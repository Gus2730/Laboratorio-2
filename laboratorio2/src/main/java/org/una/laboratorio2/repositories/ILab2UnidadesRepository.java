/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.una.laboratorio2.entities.Lab2Unidades;

/**
 *
 * @author colo7
 */
public interface ILab2UnidadesRepository extends JpaRepository<Lab2Unidades, Long>{
     @Query(value = "SELECT t FROM Lab2Unidades t JOIN t.doctorId po JOIN po.especialidadId u where u.nombre=:nombre")
    public List<Lab2Unidades> findByUnidadDoctorEspecialidadId(@Param("nombre") String nombre);
    
}
