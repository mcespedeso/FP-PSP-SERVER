package py.org.fundacionparaguaya.pspserver.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.org.fundacionparaguaya.pspserver.families.dtos.GenderDTO;
import py.org.fundacionparaguaya.pspserver.families.services.GenderService;

@RestController
@RequestMapping(value = "/api/v1/genders")
public class GenderController {

    private static final Logger LOG = LoggerFactory
            .getLogger(GenderController.class);

    private GenderService genderService;

    public GenderController(GenderService genderService) {
        this.genderService = genderService;
    }

    @GetMapping()
    public ResponseEntity<List<GenderDTO>> getAllGenders() {
        List<GenderDTO> genders = genderService.getAll();
        return ResponseEntity.ok(genders);
    }

    @GetMapping("/{genderId}")
    public ResponseEntity<List<GenderDTO>> getGenderById() {
        List<GenderDTO> genders = genderService.getAll();
        return ResponseEntity.ok(genders);
    }

}
