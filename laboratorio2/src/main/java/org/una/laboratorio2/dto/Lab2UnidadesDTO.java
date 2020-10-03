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
import org.una.laboratorio2.entities.*;

/**
 *
 * @author colo7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lab2UnidadesDTO {

    private Long id;

    private String nombre;

    private String codigo;

    private String planta;

    private Lab2DoctoresDTO doctorId;

    private boolean estado;

    private Date fechaRegistro;

    private Date fechaModificacion;
}
