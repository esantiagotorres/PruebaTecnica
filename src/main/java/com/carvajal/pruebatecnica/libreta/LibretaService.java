package com.carvajal.pruebatecnica.libreta;


import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class LibretaService  {

   private LibretaRepository libretaRepository;

    public LibretaService(LibretaRepository libretaRepository) {
        this.libretaRepository = libretaRepository;
    }


    public List<LibretaDto> get() {
        List<LibretaEntity> libretas = libretaRepository.findAll();
        return libretas.stream().map(LibretaDto::map).collect(Collectors.toList());
    }

    public LibretaDto get(Long id) {
        LibretaEntity libreta = libretaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("libreta no encontrada"));
        return LibretaDto.map(libreta);
    }

    public LibretaDto post(LibretaDto libretaDto) {
        LibretaEntity libreta = LibretaEntity.map(libretaDto);
        LibretaEntity libretaSave = libretaRepository.save(libreta);
        return LibretaDto.map(libretaSave);


    }


    public LibretaDto put(LibretaDto libretaDto, Long id) {
        LibretaEntity libreta = libretaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("libreta no encontradaa"));
        if (libretaDto.getNombre() != null)
            libreta.setNombre(libretaDto.getNombre());
        if (libretaDto.getApellido() != null)
            libreta.setApellido(libretaDto.getApellido());
        if (libretaDto.getDireccion() != null)
            libreta.setDireccion(libretaDto.getDireccion());
        if (libretaDto.getCorreo() != null)
            libreta.setCorreo(libretaDto.getCorreo());
        if (libretaDto.getCelular() != null)
            libreta.setCelular(libretaDto.getCelular());
        if (libretaDto.getTelefono() != null)
            libreta.setTelefono(libretaDto.getTelefono());
        libreta.setAcitvo(libretaDto.isAcitvo());

        libreta = libretaRepository.save(libreta);
        return LibretaDto.map(libreta);
    }


    public LibretaDto delete(Long id) {
        LibretaEntity libreta = libretaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("libreta no encontradaa"));
       libretaRepository.delete(libreta);
        return LibretaDto.map(libreta);
    }
}
