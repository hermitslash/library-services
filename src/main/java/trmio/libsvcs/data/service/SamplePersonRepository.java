package trmio.libsvcs.data.service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import trmio.libsvcs.data.entity.SamplePerson;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}