package com.antoniodev.gestorcafe.infrastructure.repositories;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.infrastructure.entities.FarmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaFarmRepository extends JpaRepository<FarmEntity, Long> {
}
