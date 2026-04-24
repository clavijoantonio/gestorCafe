package com.antoniodev.gestorcafe.domain.ports.in;

import com.antoniodev.gestorcafe.domain.models.Lote;

public interface DeleteLoteUseCase {
    Lote deleteLote(Lote lote);
}
