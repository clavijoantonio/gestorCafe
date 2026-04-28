package com.antoniodev.gestorcafe.infrastructure.repositories;


import com.antoniodev.gestorcafe.domain.models.Lote;
import com.antoniodev.gestorcafe.domain.ports.out.LoteRepositoryPort;
import com.antoniodev.gestorcafe.infrastructure.entities.LoteEntity;
import com.antoniodev.gestorcafe.infrastructure.mappers.LoteMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
public class JpaLoteRepositoryAdapter implements LoteRepositoryPort {

    private final JpaLoteRepository jpaLoteRepository;
    private final LoteMapper loteMapper;

    public JpaLoteRepositoryAdapter(JpaLoteRepository jpaLoteRepository, LoteMapper loteMapper) {
        this.jpaLoteRepository = jpaLoteRepository;
        this.loteMapper = loteMapper;
    }
    @Override
    @Transactional
    public Lote save(Lote lote) {
        try {
            // Convierte Domain → Entity
            LoteEntity loteEntity = loteMapper.toEntity(lote);

            // Guarda la entidad
            LoteEntity savedEntity = jpaLoteRepository.save(loteEntity);

            // Convierte de vuelta a Domain
            return loteMapper.toDomain(savedEntity);

        } catch (DataAccessException e) {
            throw new RuntimeException("Error saving lote: " + e.getMessage(), e);
        }
    }

    @Override
    public Optional<Lote> findById(long id) {
        return jpaLoteRepository.findById(id).map(loteMapper::toDomain);
    }

    @Override
    public List<Lote> findAll() {
        return jpaLoteRepository.findAll().stream()
                .map(loteMapper::toDomain).toList();
    }

    @Override
    public Optional<Lote> update(Lote lote) {
        if(jpaLoteRepository.existsById(lote.getId())) {
            LoteEntity loteEntity = loteMapper.toEntity(lote);
            LoteEntity updateEntity = jpaLoteRepository.save(loteEntity);
            return Optional.of(loteMapper.toDomain(updateEntity));

        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaLoteRepository.existsById(id)){
            jpaLoteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
