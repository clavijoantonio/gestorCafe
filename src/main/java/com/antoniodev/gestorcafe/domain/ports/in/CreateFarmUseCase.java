package com.antoniodev.gestorcafe.domain.ports.in;

import com.antoniodev.gestorcafe.domain.models.Farm;

public interface CreateFarmUseCase {
    Farm createFarm(Farm farm);
}
