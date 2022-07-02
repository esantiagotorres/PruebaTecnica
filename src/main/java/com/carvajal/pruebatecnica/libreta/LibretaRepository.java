package com.carvajal.pruebatecnica.libreta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibretaRepository extends JpaRepository<LibretaEntity, Long> {




}
