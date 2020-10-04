package org.una.laboratorio2.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.una.laboratorio2.entities.Lab2Doctores;

/**
 *
 * @author colo7
 */
public interface ILab2DoctoresRepository extends JpaRepository<Lab2Doctores, Long> {

}
