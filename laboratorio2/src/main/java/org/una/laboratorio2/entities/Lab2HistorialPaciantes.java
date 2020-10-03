/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author colo7
 */
@Entity
@Table(name = "lab2_Historial_Paciantes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lab2HistorialPaciantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150)
    private String tratamiento;
    
    @Column(length = 100)
    private String sintoma;
 
    @Column
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Lab2Doctores doctorId;
     
     @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Lab2Pacientes pacienteId;

    @Column(name = "fecha_ingreso", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.NONE)
    private Date fechaIngreso;
    
    private static final long serialVersionUID = 1L;

    @PrePersist
    public void prePersist() {
        estado = true;
        fechaIngreso = new Date();
    }

    @PreUpdate
    public void preUpdate() {
    }
}
