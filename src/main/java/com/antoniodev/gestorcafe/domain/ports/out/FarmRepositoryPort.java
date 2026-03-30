package com.antoniodev.gestorcafe.domain.ports.out;

import com.antoniodev.gestorcafe.domain.models.Farm;

import java.util.List;
import java.util.Optional;

public interface FarmRepositoryPort {
    Farm save(Farm farm);
    Optional<Farm> findById(long id);
    List<Farm> findAll();
    Optional<Farm> update(Farm farm);
    boolean deleteById(Long id);

}
