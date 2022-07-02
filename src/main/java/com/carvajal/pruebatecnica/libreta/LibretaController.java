package com.carvajal.pruebatecnica.libreta;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/v1/libreta")
public class LibretaController implements LibretaAPI{

   private LibretaService libretaService;

   public LibretaController ( LibretaService libretaService){
       this.libretaService = libretaService;
   }

    @Override
    @GetMapping("/")
    public List<LibretaDto> get() {
        return libretaService.get();
    }

    @Override
    @GetMapping("/{id}")
    public LibretaDto get(Long id) {
        return libretaService.get(id);
    }

    @Override
    @PostMapping("/")
    public LibretaDto post(LibretaDto libretaDto) {
        return libretaService.post(libretaDto );
    }

    @Override
    @PutMapping("/{id}")
    public LibretaDto put(LibretaDto libretaDto, Long id) {
        return libretaService.put(libretaDto, id);
    }

    @Override
    @DeleteMapping("/{id}")
    public LibretaDto delete(Long id) {
        return libretaService.delete(id);
    }


}
