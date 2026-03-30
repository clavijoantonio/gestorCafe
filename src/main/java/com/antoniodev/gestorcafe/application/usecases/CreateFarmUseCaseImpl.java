package com.antoniodev.gestorcafe.application.usecases;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.ports.in.CreateFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;

public class CreateFarmUseCaseImpl implements CreateFarmUseCase {

    private final FarmRepositoryPort farmRepositoryPort;

    public CreateFarmUseCaseImpl(FarmRepositoryPort farmRepositoryPort) {
        this.farmRepositoryPort = farmRepositoryPort;
    }

    @Override
    public Farm createFarm(Farm farm) {
        return farmRepositoryPort.save(farm);
    }
}
