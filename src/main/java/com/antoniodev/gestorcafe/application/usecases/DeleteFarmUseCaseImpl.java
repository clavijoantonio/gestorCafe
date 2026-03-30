package com.antoniodev.gestorcafe.application.usecases;

import com.antoniodev.gestorcafe.domain.ports.in.DeleteFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;

public class DeleteFarmUseCaseImpl implements DeleteFarmUseCase {

    private final FarmRepositoryPort farmRepositoryPort;

    public DeleteFarmUseCaseImpl(FarmRepositoryPort farmRepositoryPort) {
        this.farmRepositoryPort = farmRepositoryPort;
    }

    @Override
    public boolean deleteFarm(Long id) {
        return farmRepositoryPort.deleteById(id);
    }
}
