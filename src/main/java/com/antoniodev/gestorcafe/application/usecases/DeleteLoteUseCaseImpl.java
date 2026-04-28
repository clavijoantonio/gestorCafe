package com.antoniodev.gestorcafe.application.usecases;

import com.antoniodev.gestorcafe.domain.ports.in.DeleteFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.in.DeleteLoteUseCase;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;
import com.antoniodev.gestorcafe.domain.ports.out.LoteRepositoryPort;

public class DeleteLoteUseCaseImpl implements DeleteLoteUseCase {

    private final LoteRepositoryPort loteRepositoryPort;

    public DeleteLoteUseCaseImpl(LoteRepositoryPort loteRepositoryPort) {
        this.loteRepositoryPort = loteRepositoryPort;
    }

    @Override
    public boolean deleteLote(Long id) {
        return loteRepositoryPort.deleteById(id);
    }
}
