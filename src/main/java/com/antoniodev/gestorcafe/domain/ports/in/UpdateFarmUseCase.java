package com.antoniodev.gestorcafe.domain.ports.in;

import com.antoniodev.gestorcafe.domain.models.Farm;

import java.util.Optional;

public interface UpdateFarmUseCase {
    Optional<Farm> updateFarm(long id, Farm updateFarm);
}
