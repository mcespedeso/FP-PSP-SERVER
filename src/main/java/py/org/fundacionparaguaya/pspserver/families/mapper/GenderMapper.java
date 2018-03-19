package py.org.fundacionparaguaya.pspserver.families.mapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import py.org.fundacionparaguaya.pspserver.common.mapper.BaseMapper;
import py.org.fundacionparaguaya.pspserver.families.dtos.GenderDTO;
import py.org.fundacionparaguaya.pspserver.families.entities.GenderEntity;

@Component
public class GenderMapper implements BaseMapper<GenderEntity, GenderDTO> {

    private final ModelMapper modelMapper;

    public GenderMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public List<GenderDTO> entityListToDtoList(List<GenderEntity> entityList) {
        return entityList.stream().filter(Objects::nonNull)
                .map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public GenderDTO entityToDto(GenderEntity entity) {
        GenderDTO dto = modelMapper.map(entity, GenderDTO.class);
        return dto;
    }

    @Override
    public GenderEntity dtoToEntity(GenderDTO dto) {
        return modelMapper.map(dto, GenderEntity.class);
    }

}
