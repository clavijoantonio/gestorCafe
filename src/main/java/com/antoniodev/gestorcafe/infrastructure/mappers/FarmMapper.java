package com.antoniodev.gestorcafe.infrastructure.mappers;

import com.antoniodev.gestorcafe.domain.models.Farm;
import com.antoniodev.gestorcafe.infrastructure.entities.FarmEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(
        componentModel = "spring",
        //uses = {OwnerMapper.class, LocationMapper.class}, // Otros mappers si los necesitas
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface FarmMapper {

    // Mapeo básico
    @Mapping(target = "id", ignore = true) // Para creación (ID se genera automáticamente)
    FarmEntity toEntity(Farm farm);

    Farm toDomain(FarmEntity entity);

    // Listas
    List<FarmEntity> toEntityList(List<Farm> farms);

    List<Farm> toDomainList(List<FarmEntity> entities);

    // Mapeo para actualización
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    void updateEntity(Farm farm, @MappingTarget FarmEntity entity);

    // Mapeo personalizado si es necesario
   /* @AfterMapping
    default void afterMapping(@MappingTarget FarmEntity entity) {
        // Lógica post-mapeo si es necesaria
        if (entity.getObsevaciones() != null && entity.getObservaciones().length() > 500) {
            entity.setObservaciones(entity.getObservaciones().substring(0, 500));
        }
    }*/
}