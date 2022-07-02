package com.carvajal.pruebatecnica.libreta;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Data

@Entity
@Table(name = "libreta")
@EntityListeners(AuditingEntityListener.class)
public class LibretaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String celular;
    private String direccion;
    private boolean acitvo;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate creationDate;


    @LastModifiedDate
    @Column(name = "last_modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate lastModifiedDate;


    public static LibretaEntity map(LibretaDto libretaDto) {

        LibretaEntity libretaEntity = new LibretaEntity();
        if (libretaDto.getId() != null)
            libretaEntity.setId(libretaDto.getId());

        if (libretaDto.getId() != null)
            libretaEntity.setNombre(libretaDto.getNombre());
        if (libretaDto.getId() != null)
            libretaEntity.setApellido(libretaDto.getApellido());
        if (libretaDto.getId() != null)
            libretaEntity.setDireccion(libretaDto.getDireccion());
        if (libretaDto.getId() != null)
            libretaEntity.setCorreo(libretaDto.getCorreo());
        if (libretaDto.getId() != null)
            libretaEntity.setCelular(libretaDto.getCelular());
        if (libretaDto.getId() != null)
            libretaEntity.setTelefono(libretaDto.getTelefono());
        if (libretaDto.getId() != null)
            libretaEntity.setAcitvo(libretaDto.isAcitvo());

        return libretaEntity;
    }
}
