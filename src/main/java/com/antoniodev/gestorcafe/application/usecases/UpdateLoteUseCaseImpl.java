package com.antoniodev.gestorcafe.application.usecases;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.models.Lote;
import com.antoniodev.gestorcafe.domain.ports.in.UpdateFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.in.UpdateLoteUseCase;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;
import com.antoniodev.gestorcafe.domain.ports.out.LoteRepositoryPort;

import java.util.Optional;

public class UpdateLoteUseCaseImpl implements UpdateLoteUseCase {

    private final LoteRepositoryPort loteRepositoryPort;

    public UpdateLoteUseCaseImpl(LoteRepositoryPort loteRepositoryPort) {
        this.loteRepositoryPort = loteRepositoryPort;
    }

    @Override
    public Optional<Lote> updateLote(Long id, Lote updateLote) {
        return loteRepositoryPort.update(updateLote);
    }
}
