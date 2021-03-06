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
@Table(name = "lab2_Intervenciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lab2Intervenciones implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String sintoma;

    @ManyToOne
    @JoinColumn(name = "tratamiento_id")
    private Lab2Tratamientos tratamientoId;

    private static final long serialVersionUID = 1L;

    @Column(name = "fecha_registro", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.NONE)
    private Date fechaRegistro;

    @PrePersist
    public void prePersist() {
        fechaRegistro = new Date();
    }

}
