package br.org.jprojects.desafiodesignpatternsspring.mappers;

import br.org.jprojects.desafiodesignpatternsspring.dto.AddressDTO;
import br.org.jprojects.desafiodesignpatternsspring.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    @Mapping(target = "street", source = "logradouro")
    @Mapping(target = "complement", source = "complemento")
    @Mapping(target = "neighborhoodArea", source = "bairro")
    @Mapping(target = "city", source = "localidade")
    @Mapping(target = "district", source = "uf")
    void updateModel(AddressDTO addressDTO, @MappingTarget Address address);
}
