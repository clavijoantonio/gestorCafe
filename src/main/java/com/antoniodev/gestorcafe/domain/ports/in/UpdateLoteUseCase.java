package com.antoniodev.gestorcafe.domain.ports.in;

import com.antoniodev.gestorcafe.domain.models.Lote;

import java.util.Optional;

public interface UpdateLoteUseCase {
    Optional<Lote> updateLote(Long id, Lote updateLote);
}
