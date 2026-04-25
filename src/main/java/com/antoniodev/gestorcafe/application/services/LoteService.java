package com.antoniodev.gestorcafe.application.services;

import com.antoniodev.gestorcafe.domain.models.Lote;
import com.antoniodev.gestorcafe.domain.ports.in.CreateLoteUseCase;
import com.antoniodev.gestorcafe.domain.ports.in.DeleteLoteUseCase;
import com.antoniodev.gestorcafe.domain.ports.in.RetriveLoteUseCase;
import com.antoniodev.gestorcafe.domain.ports.in.UpdateLoteUseCase;

import java.util.List;
import java.util.Optional;

public class LoteService implements CreateLoteUseCase, RetriveLoteUseCase, UpdateLoteUseCase, DeleteLoteUseCase {
    private final CreateLoteUseCase createLoteUseCase;
    private final RetriveLoteUseCase retriveLoteUseCase;
    private final UpdateLoteUseCase updateLoteUseCase;
    private final DeleteLoteUseCase deleteLoteUseCase;

    public LoteService(CreateLoteUseCase createLoteUseCase, RetriveLoteUseCase retriveLoteUseCase, UpdateLoteUseCase updateLoteUseCase, DeleteLoteUseCase deleteLoteUseCase) {
        this.createLoteUseCase = createLoteUseCase;
        this.retriveLoteUseCase = retriveLoteUseCase;
        this.updateLoteUseCase = updateLoteUseCase;
        this.deleteLoteUseCase = deleteLoteUseCase;
    }

    @Override
    public Lote createLote(Lote lote) {
        return createLoteUseCase.createLote(lote);
    }

    @Override
    public Lote deleteLote(Long id) {
        return deleteLoteUseCase.deleteLote(id);
    }

    @Override
    public Optional<Lote> getLote(Long id) {
        return retriveLoteUseCase.getLote(id);
    }

    @Override
    public List<Lote> getAll() {
        return retriveLoteUseCase.getAll();
    }

    @Override
    public Optional<Lote> updateLote(Long id, Lote updateLote) {
        return updateLoteUseCase.updateLote(id,updateLote);
    }
}
