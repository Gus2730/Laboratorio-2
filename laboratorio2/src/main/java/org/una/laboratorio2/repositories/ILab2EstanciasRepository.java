/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.una.laboratorio2.entities.Lab2Estancias;

/**
 *
 * @author colo7
 */
public interface ILab2EstanciasRepository extends JpaRepository<Lab2Estancias, Long>{
    @Query(value = "SELECT t FROM Lab2Estancias t JOIN t.unidadId po JOIN po.doctorId u where po.codigo=:code and u.codigo=:codigo")
    public List<Lab2Estancias> findByCodigoAndEspecialidad(@Param("code")String code,@Param("codigo") String codigo);
    
    @Query(value = "SELECT t FROM Lab2Estancias t JOIN t.intervencionesId po JOIN po.tratamientoId u where po.id=:id and u.codigo=:codigo")
    public List<Lab2Estancias> findByIntervencionAndCodigo(@Param("id")Long intervencionId,@Param("codigo") String codigo);
}
