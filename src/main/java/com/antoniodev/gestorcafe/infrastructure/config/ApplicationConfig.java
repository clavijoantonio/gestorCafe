package com.antoniodev.gestorcafe.infrastructure.config;

import com.antoniodev.gestorcafe.application.services.FarmService;
import com.antoniodev.gestorcafe.application.usecases.CreateFarmUseCaseImpl;
import com.antoniodev.gestorcafe.application.usecases.DeleteFarmUseCaseImpl;
import com.antoniodev.gestorcafe.application.usecases.RetrieveFarmUseCaseImpl;
import com.antoniodev.gestorcafe.application.usecases.UpdateFarmUseCaseImpl;
import com.antoniodev.gestorcafe.domain.ports.out.ExternalServicePort;
import com.antoniodev.gestorcafe.domain.ports.out.FarmRepositoryPort;
import com.antoniodev.gestorcafe.infrastructure.adapters.ExternalServiceAdapter;
import com.antoniodev.gestorcafe.infrastructure.repositories.JpaFarmRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public FarmService farmService (FarmRepositoryPort farmRepositoryPort){
        return new FarmService(
                new CreateFarmUseCaseImpl(farmRepositoryPort),
                new RetrieveFarmUseCaseImpl(farmRepositoryPort),
                new DeleteFarmUseCaseImpl(farmRepositoryPort),
                new UpdateFarmUseCaseImpl(farmRepositoryPort)

        );
    }

    @Bean
    public FarmRepositoryPort farmRepositoryPort(JpaFarmRepositoryAdapter jpaFarmRepositoryAdapter){
        return  jpaFarmRepositoryAdapter;
    }


    @Bean
    public ExternalServicePort externalServicePort (){
        return  new ExternalServiceAdapter();
    }
}
