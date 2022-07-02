package com.carvajal.pruebatecnica.libreta;

import java.util.Objects;

public class LibretaDto {

    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String celular;
    private String direccion;
    private boolean acitvo;

    public static LibretaDto map(LibretaEntity libretaEntity){
         LibretaDto libretaDto= new LibretaDto();
         libretaDto.setId(libretaEntity.getId());
        libretaDto.setNombre(libretaEntity.getNombre());
        libretaDto.setApellido(libretaEntity.getApellido());
        libretaDto.setCorreo(libretaEntity.getCorreo());
        libretaDto.setTelefono(libretaEntity.getTelefono());
        libretaDto.setCelular(libretaEntity.getCelular());
        libretaDto.setDireccion(libretaEntity.getDireccion());
        libretaDto.setAcitvo(libretaEntity.isAcitvo());
        return libretaDto;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isAcitvo() {
        return acitvo;
    }

    public void setAcitvo(boolean acitvo) {
        this.acitvo = acitvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibretaDto that = (LibretaDto) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
