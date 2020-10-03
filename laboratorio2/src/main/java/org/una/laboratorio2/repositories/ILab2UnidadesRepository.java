/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.una.laboratorio2.entities.Lab2Unidades;

/**
 *
 * @author colo7
 */
public interface ILab2UnidadesRepository extends JpaRepository<Lab2Unidades, Long>{
     @Query(value = "SELECT t FROM Lab2Unidades t JOIN t.doctorId po JOIN po.especialidadId u where t.id=:id and u.nombre=:nombre")
    public List<Lab2Unidades> findByUnidadDoctorEspecialidadId(@Param("id")Long doctorId,@Param("nombre") String nombre);
    
}
