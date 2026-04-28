package com.antoniodev.gestorcafe.application.usecases;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.models.Lote;
import com.antoniodev.gestorcafe.domain.ports.in.RetrieveLoteUseCase;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;
import com.antoniodev.gestorcafe.domain.ports.out.LoteRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveLoteUseCaseImpl implements RetrieveLoteUseCase {


    private final LoteRepositoryPort loteRepositoryPort;

    public RetrieveLoteUseCaseImpl(LoteRepositoryPort loteRepositoryPort) {
        this.loteRepositoryPort = loteRepositoryPort;
    }

    @Override
    public Optional<Lote> getLote(Long id) {
        return loteRepositoryPort.findById(id);
    }

    @Override
    public List<Lote> getAllLote() {
        return loteRepositoryPort.findAll();
    }
}
