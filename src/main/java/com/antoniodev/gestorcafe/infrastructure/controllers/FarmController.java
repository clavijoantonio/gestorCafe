package com.antoniodev.gestorcafe.infrastructure.controllers;

import com.antoniodev.gestorcafe.application.services.FarmService;
import com.antoniodev.gestorcafe.domain.models.Farm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farm")
public class FarmController {

    private final FarmService farmService;

    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }

    @PostMapping
    public ResponseEntity<Farm> createFarm(@RequestBody Farm farm){
        Farm createFarm = farmService.createFarm(farm);
        return  new ResponseEntity<>(createFarm,HttpStatus.CREATED);
    }
    @GetMapping("/{farmId}")
    public ResponseEntity<Farm> getFarm (@PathVariable Long farmId){
        return farmService.getFarm(farmId)
                .map(farm->new ResponseEntity<>(farm,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity <List<Farm>> getFarmAll(){
        List<Farm> farms = farmService.getAllFarm();
        return new ResponseEntity<>(farms, HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Farm> updateFarm(@PathVariable Long farmId,@RequestBody Farm updateFarm){
        return farmService.updateFarm(farmId, updateFarm)
                .map(farm -> new ResponseEntity<>(farm, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping ResponseEntity<Void> deleteFarmId (@PathVariable Long farmId){
        if(farmService.deleteFarm(farmId)){
          return  new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
