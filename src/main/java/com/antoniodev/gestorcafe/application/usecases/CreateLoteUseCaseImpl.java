package com.antoniodev.gestorcafe.application.usecases;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.models.Lote;
import com.antoniodev.gestorcafe.domain.ports.in.CreateFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.in.CreateLoteUseCase;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;
import com.antoniodev.gestorcafe.domain.ports.out.LoteRepositoryPort;

public class CreateLoteUseCaseImpl implements CreateLoteUseCase {

    private final LoteRepositoryPort loteRepositoryPort;

    public CreateLoteUseCaseImpl(LoteRepositoryPort loteRepositoryPort) {
        this.loteRepositoryPort = loteRepositoryPort;
    }

    @Override
    public Lote createLote(Lote lote) {
        return loteRepositoryPort.save(lote);
    }
}
