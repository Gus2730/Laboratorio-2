/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Lab2EstanciasDTO {
    
    private Long id;
    
    private Date fechaingreso;
    
    private Lab2IntervencionesDTO intervencionId;
    
    private Lab2PacientesDTO pacienteId;
    
    private Lab2UnidadesDTO unidadId;
   
    
}
