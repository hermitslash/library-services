package trmio.libsvcs.data.endpoint;

import dev.hilla.Endpoint;
import dev.hilla.Nonnull;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import trmio.libsvcs.data.entity.SamplePerson;
import trmio.libsvcs.data.service.SamplePersonService;

@Endpoint
@RolesAllowed("ADMIN")
public class SamplePersonEndpoint {

    private final SamplePersonService service;

    @Autowired
    public SamplePersonEndpoint(SamplePersonService service) {
        this.service = service;
    }

    @Nonnull
    public Page<@Nonnull SamplePerson> list(Pageable page) {
        return service.list(page);
    }

    public Optional<SamplePerson> get(@Nonnull UUID id) {
        return service.get(id);
    }

    @Nonnull
    public SamplePerson update(@Nonnull SamplePerson entity) {
        return service.update(entity);
    }

    public void delete(@Nonnull UUID id) {
        service.delete(id);
    }

    public int count() {
        return service.count();
    }

}
