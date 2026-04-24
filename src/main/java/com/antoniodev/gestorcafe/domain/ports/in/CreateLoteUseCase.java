package com.antoniodev.gestorcafe.domain.ports.in;

import com.antoniodev.gestorcafe.domain.models.Lote;

public interface CreateLoteUseCase {
    Lote createLote(Lote lotes);
}
