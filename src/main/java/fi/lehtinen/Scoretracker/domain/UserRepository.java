package fi.lehtinen.Scoretracker.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usr, Long> {
	Usr findByUsername(String username);
}