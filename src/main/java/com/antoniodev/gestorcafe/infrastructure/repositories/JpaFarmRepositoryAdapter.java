package com.antoniodev.gestorcafe.infrastructure.repositories;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;
import com.antoniodev.gestorcafe.infrastructure.entities.FarmEntity;
import com.antoniodev.gestorcafe.infrastructure.mappers.FarmMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaFarmRepositoryAdapter implements FarmRepositoryPort{

    private final JpaFarmRepository jpaFarmRepository;
    private final FarmMapper farmMapper;

    public JpaFarmRepositoryAdapter(JpaFarmRepository jpaFarmRepository, FarmMapper farmMapper) {
        this.jpaFarmRepository = jpaFarmRepository;
        this.farmMapper = farmMapper;
    }

    @Override
    @Transactional
    public Farm save(Farm farm) {
        try {
            // Convierte Domain → Entity
            FarmEntity farmEntity = farmMapper.toEntity(farm);

            // Guarda la entidad
            FarmEntity savedEntity = jpaFarmRepository.save(farmEntity);

            // Convierte de vuelta a Domain
            return farmMapper.toDomain(savedEntity);

        } catch (DataAccessException e) {
            throw new RuntimeException("Error saving farm: " + e.getMessage(), e);
        }
    }

    @Override
    public Optional<Farm> findById(long id) {
        return jpaFarmRepository.findById(id).map(farmMapper::toDomain);
    }

    @Override
    public List<Farm> findAll() {
        return jpaFarmRepository.findAll().stream().map(farmMapper::toDomain).toList();
    }

    @Override
    public Optional<Farm> update(Farm farm) {
        if(jpaFarmRepository.existsById(farm.getId())) {
            FarmEntity farmEntity = farmMapper.toEntity(farm);
            FarmEntity updateEntity = jpaFarmRepository.save(farmEntity);
         return Optional.of(farmMapper.toDomain(updateEntity));

        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaFarmRepository.existsById(id)){
            jpaFarmRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
