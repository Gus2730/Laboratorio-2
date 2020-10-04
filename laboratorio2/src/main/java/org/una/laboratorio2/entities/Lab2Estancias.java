package org.una.laboratorio2.entities;

import java.io.Serializable;
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
@Table(name = "lab2_Estancias")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lab2Estancias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "intervencion_id")
    private Lab2Intervenciones intervencionId;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Lab2Pacientes pacienteId;

    @ManyToOne
    @JoinColumn(name = "unidad_id")
    private Lab2Unidades unidadId;

    @Column(name = "fecha_ingreso", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.NONE)
    private Date fechaingreso;

    @PrePersist
    public void prePersist() {
        fechaingreso = new Date();
    }

}
