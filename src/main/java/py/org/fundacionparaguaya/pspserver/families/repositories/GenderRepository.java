package py.org.fundacionparaguaya.pspserver.families.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import py.org.fundacionparaguaya.pspserver.families.entities.GenderEntity;

public interface GenderRepository extends JpaRepository<GenderEntity, Integer>  {

}
