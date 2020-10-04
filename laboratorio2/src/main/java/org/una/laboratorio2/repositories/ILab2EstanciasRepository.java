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
public interface ILab2EstanciasRepository extends JpaRepository<Lab2Estancias, Long> {

    @Query(value = "SELECT t FROM Lab2Estancias t JOIN t.unidadId po JOIN po.doctorId u where u.codigo=:codigo")
    public List<Lab2Estancias> findByCodigoDoctor(@Param("codigo") String codigo);

    @Query(value = "SELECT t FROM Lab2Estancias t JOIN t.intervencionId po JOIN po.tratamientoId u where u.codigo=:codigo")
    public List<Lab2Estancias> findByTratamientoCodigo(@Param("codigo") String codigo);
}
