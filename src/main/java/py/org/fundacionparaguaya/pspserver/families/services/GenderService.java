package py.org.fundacionparaguaya.pspserver.families.services;

import java.util.List;

import py.org.fundacionparaguaya.pspserver.families.dtos.GenderDTO;

public interface GenderService {

    List<GenderDTO> getAll();

    GenderDTO getById(Integer genderId);

}
