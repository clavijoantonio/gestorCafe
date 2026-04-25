package com.antoniodev.gestorcafe.domain.ports.out;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.models.Lote;

import java.util.List;
import java.util.Optional;

public interface LoteRepositoryPort {
    Lote save(Lote lote);
    Optional<Lote> findById(long id);
    List<Lote> findAll();
    Optional<Lote> update(Lote lote);
    boolean deleteById(Long id);
}
