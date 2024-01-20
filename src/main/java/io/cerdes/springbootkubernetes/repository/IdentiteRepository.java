package io.cerdes.springbootkubernetes.repository;

import io.cerdes.springbootkubernetes.entity.Identite;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IdentiteRepository extends ListCrudRepository<Identite, UUID> {
}
