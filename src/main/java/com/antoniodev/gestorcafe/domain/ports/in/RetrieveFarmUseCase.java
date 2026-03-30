package com.antoniodev.gestorcafe.domain.ports.in;

import com.antoniodev.gestorcafe.domain.models.Farm;

import java.util.List;
import java.util.Optional;

public interface RetrieveFarmUseCase {
    Optional<Farm> getFarm(Long id);

    List<Farm> getAllFarm();
}
