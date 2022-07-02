package com.carvajal.pruebatecnica.libreta;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface LibretaAPI {

     List<LibretaDto> get();
      LibretaDto get(@PathVariable Long id);
      LibretaDto post(@RequestBody LibretaDto libretaDto);
      LibretaDto put(@RequestBody LibretaDto libretaDto, @PathVariable Long id);
      LibretaDto delete(@PathVariable Long id);

}
