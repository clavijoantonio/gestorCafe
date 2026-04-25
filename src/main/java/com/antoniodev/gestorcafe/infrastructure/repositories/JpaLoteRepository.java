package com.antoniodev.gestorcafe.infrastructure.repositories;

import com.antoniodev.gestorcafe.infrastructure.entities.LoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaLoteRepository extends JpaRepository<LoteEntity, Long> {
}
