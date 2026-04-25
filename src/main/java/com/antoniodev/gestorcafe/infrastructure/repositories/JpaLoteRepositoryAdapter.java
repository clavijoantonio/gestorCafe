package com.antoniodev.gestorcafe.infrastructure.repositories;

import com.antoniodev.gestorcafe.infrastructure.mappers.LoteMapper;
import org.springframework.stereotype.Component;

@Component
public class JpaLoteRepositoryAdapter implements JpaLoteRepository{
    private final JpaLoteRepository jpaLoteRepository;
    private final LoteMapper loteMapper;

    public JpaLoteRepositoryAdapter(JpaLoteRepository jpaLoteRepository, LoteMapper loteMapper) {
        this.jpaLoteRepository = jpaLoteRepository;
        this.loteMapper = loteMapper;
    }

}
