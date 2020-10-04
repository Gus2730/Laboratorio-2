
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
public class Lab2PacientesDTO {
    
    private Long id;

    private String nombreCompleto;

    private String seguro;
    
    private String edad;
 
    private boolean estado;

    private Date fechaRegistro;

    private Date fechaModificacion;
}
