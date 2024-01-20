package io.cerdes.springbootkubernetes;

import io.cerdes.springbootkubernetes.entity.Identite;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface IdentiteService extends ListCrudRepository<Identite, UUID> {
}
