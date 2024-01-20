package io.cerdes.springbootkubernetes;

import io.cerdes.springbootkubernetes.entity.Identite;
import io.cerdes.springbootkubernetes.repository.IdentiteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class IdentiteServiceImpl implements IdentiteService {

    private final IdentiteRepository repository;

    @Override
    public <S extends Identite> S save(S entity) {
        return repository.save(entity);
    }

    @Override
    public <S extends Identite> List<S> saveAll(Iterable<S> entities) {
        return repository.saveAll(entities);
    }

    @Override
    public Optional<Identite> findById(UUID uuid) {
        return repository.findById(uuid);
    }

    @Override
    public boolean existsById(UUID uuid) {
        return repository.existsById(uuid);
    }

    @Override
    public List<Identite> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Identite> findAllById(Iterable<UUID> uuids) {
        return repository.findAllById(uuids);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void deleteById(UUID uuid) {
        repository.deleteById(uuid);
    }

    @Override
    public void delete(Identite entity) {
        repository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {
        repository.deleteAllById(uuids);
    }

    @Override
    public void deleteAll(Iterable<? extends Identite> entities) {
        repository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
