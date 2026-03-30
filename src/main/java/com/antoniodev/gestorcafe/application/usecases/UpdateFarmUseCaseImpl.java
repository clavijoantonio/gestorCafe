package com.antoniodev.gestorcafe.application.usecases;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.ports.in.UpdateFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;

import java.util.Optional;

public class UpdateFarmUseCaseImpl implements UpdateFarmUseCase {

   private final FarmRepositoryPort farmRepositoryPort;

    public UpdateFarmUseCaseImpl(FarmRepositoryPort farmRepositoryPort) {
        this.farmRepositoryPort = farmRepositoryPort;
    }

    @Override
    public Optional<Farm> updateFarm(long id, Farm updateFarm) {
        return farmRepositoryPort.update(updateFarm);
    }
}
