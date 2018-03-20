package py.org.fundacionparaguaya.pspserver.families.services.impl;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import py.org.fundacionparaguaya.pspserver.common.exceptions.UnknownResourceException;
import py.org.fundacionparaguaya.pspserver.config.I18n;
import py.org.fundacionparaguaya.pspserver.families.dtos.GenderDTO;
import py.org.fundacionparaguaya.pspserver.families.mapper.GenderMapper;
import py.org.fundacionparaguaya.pspserver.families.repositories.GenderRepository;
import py.org.fundacionparaguaya.pspserver.families.services.GenderService;

@Service
public class GenderServiceImpl implements GenderService {

    private GenderMapper genderMapper;

    private GenderRepository genderRepo;

    private final I18n i18n;

    public GenderServiceImpl(GenderMapper genderMapper,
            GenderRepository genderRepo,
            I18n i18n) {
        this.genderMapper = genderMapper;
        this.genderRepo = genderRepo;
        this.i18n = i18n;
    }

    @Override
    public List<GenderDTO> getAll() {
        return genderMapper.entityListToDtoList(genderRepo.findAll());
    }

    @Override
    public GenderDTO getGenderById(Integer genderId) {
        checkArgument(genderId > 0,
                i18n.translate("argument.nonNegative", genderId));
        return Optional.ofNullable(genderRepo.findOne(genderId)).map(genderMapper::entityToDto)
                .orElseThrow(() -> new UnknownResourceException(i18n
                        .translate("gender.notExist")));
    }

}
