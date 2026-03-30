package com.antoniodev.gestorcafe.application.usecases;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.ports.in.RetrieveFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveFarmUseCaseImpl implements RetrieveFarmUseCase {

   private final FarmRepositoryPort farmRepositoryPort;

    public RetrieveFarmUseCaseImpl(FarmRepositoryPort farmRepositoryPort) {
        this.farmRepositoryPort = farmRepositoryPort;
    }

    @Override
    public Optional<Farm> getFarm(Long id) {
        return farmRepositoryPort.findById(id);
    }

    @Override
    public List<Farm> getAllFarm() {
        return farmRepositoryPort.findAll();
    }
}
