
package org.una.laboratorio2.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author colo7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lab2TratamientosDTO {

    private Long id;

    private String nombre;

    private String codigo;

    private String observacion;

    private boolean estado;

    private Date fechaRegistro;

    private Date fechaModificacion;

}
