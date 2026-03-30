package com.antoniodev.gestorcafe.application.services;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.ports.in.CreateFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.in.DeleteFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.in.RetrieveFarmUseCase;
import com.antoniodev.gestorcafe.domain.ports.in.UpdateFarmUseCase;

import java.util.List;
import java.util.Optional;

public class FarmService implements CreateFarmUseCase, DeleteFarmUseCase, RetrieveFarmUseCase, UpdateFarmUseCase {
 private final CreateFarmUseCase createFarmUseCase;
 private final RetrieveFarmUseCase retrieveFarmUseCase;
 private final DeleteFarmUseCase deleteFarmUseCase;
 private final UpdateFarmUseCase updateFarmUseCase;

    public FarmService(CreateFarmUseCase createFarmUseCase, RetrieveFarmUseCase retrieveFarmUseCase, DeleteFarmUseCase deleteFarmUseCase, UpdateFarmUseCase updateFarmUseCase) {
        this.createFarmUseCase = createFarmUseCase;
        this.retrieveFarmUseCase = retrieveFarmUseCase;
        this.deleteFarmUseCase = deleteFarmUseCase;
        this.updateFarmUseCase = updateFarmUseCase;
    }

    @Override
    public Farm createFarm(Farm farm) {
        return createFarmUseCase.createFarm(farm);
    }

    @Override
    public boolean deleteFarm(Long id) {
        return deleteFarmUseCase.deleteFarm(id);
    }

    @Override
    public Optional<Farm> getFarm(Long id) {
        return retrieveFarmUseCase.getFarm(id);
    }

    @Override
    public List<Farm> getAllFarm() {
        return retrieveFarmUseCase.getAllFarm();
    }

    @Override
    public Optional<Farm> updateFarm(long id, Farm updateFarm) {
        return updateFarmUseCase.updateFarm(id,updateFarm);
    }
}
