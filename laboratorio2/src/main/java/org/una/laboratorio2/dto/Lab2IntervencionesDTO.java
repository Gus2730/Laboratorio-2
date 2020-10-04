
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
public class Lab2IntervencionesDTO {
    
    private Long id;
    
    private String sintoma;
    
    private Lab2TratamientosDTO tratamientoId;

    private Date fechaRegistro;
}
