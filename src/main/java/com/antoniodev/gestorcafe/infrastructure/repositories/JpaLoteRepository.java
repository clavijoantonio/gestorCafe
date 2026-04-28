package com.antoniodev.gestorcafe.infrastructure.repositories;

import com.antoniodev.gestorcafe.infrastructure.entities.LoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaLoteRepository extends JpaRepository<LoteEntity, Long> {
}
