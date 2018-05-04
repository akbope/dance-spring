package kz.kaznitu.dancing.repositories;

import kz.kaznitu.dancing.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, Long> {
    @Override
    Optional<Client> findById(Long aLong);
}
