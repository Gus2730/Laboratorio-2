/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.Setter;
import org.una.laboratorio2.entities.*;

/**
 *
 * @author colo7
 */
public class Lab2HistorialPaciantesDTO {

    private Long id;

    
    private String tratamiento;
    
  
    private String sintoma;
 
 
    private boolean estado;
    
  
    private Lab2Doctores doctorId;
     
     
    private Lab2Pacientes pacienteId;

   
    private Date fechaIngreso;
    
}
