package com.antoniodev.gestorcafe.infrastructure.controllers;

import com.antoniodev.gestorcafe.application.services.FarmService;
import com.antoniodev.gestorcafe.application.services.LoteService;
import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.domain.models.Lote;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/lote")
public class LoteController {
    private final LoteService loteService;

    public LoteController(LoteService loteService) {

        this.loteService = loteService;
    }

    @PostMapping
    public ResponseEntity<Lote> createFarm(@RequestBody Lote lote){
        Lote createLote = loteService.createLote(lote);
        return  new ResponseEntity<>(createLote, HttpStatus.CREATED);
    }
    @GetMapping("/{LoteId}")
    public ResponseEntity<Lote> getLote (@PathVariable Long loteId){
        return loteService.getLote(loteId)
                .map(lote->new ResponseEntity<>(lote,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity <List<Lote>> getLoteAll(){
        List<Lote> lotes = loteService.getAllLote();
        return new ResponseEntity<>(lotes, HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Lote> updateLote(@PathVariable Long loteId,@RequestBody Lote updateLote){
        return loteService.updateLote(loteId, updateLote)
                .map(lote -> new ResponseEntity<>(lote, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping
    ResponseEntity<Void> deleteLoteId (@PathVariable Long loteId){
        if(loteService.deleteLote(loteId)){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
