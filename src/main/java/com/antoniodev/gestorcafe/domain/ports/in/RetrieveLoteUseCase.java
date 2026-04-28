package com.antoniodev.gestorcafe.domain.ports.in;

import com.antoniodev.gestorcafe.domain.models.Lote;

import java.util.List;
import java.util.Optional;

public interface RetrieveLoteUseCase {

    Optional<Lote> getLote(Long id);

    List<Lote> getAllLote();
}
