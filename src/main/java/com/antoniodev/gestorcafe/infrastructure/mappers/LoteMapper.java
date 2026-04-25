package com.antoniodev.gestorcafe.infrastructure.mappers;


import com.antoniodev.gestorcafe.domain.models.Lote;
import com.antoniodev.gestorcafe.infrastructure.entities.LoteEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface LoteMapper {
    // Mapeo básico
    @Mapping(target = "id", ignore = true) // Para creación (ID se genera automáticamente)
    LoteEntity toEntity(Lote lote);

     Lote toDomain(LoteEntity entity);

    // Listas
    List<LoteEntity> toEntityList(List<Lote> lotes);

    List<Lote> toDomainList(List<LoteEntity> entities);

    // Mapeo para actualización
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    void updateEntity(Lote lote, @MappingTarget LoteEntity entity);


}
