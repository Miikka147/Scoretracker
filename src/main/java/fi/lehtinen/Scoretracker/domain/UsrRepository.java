package fi.lehtinen.Scoretracker.domain;



import org.springframework.data.repository.CrudRepository;

public interface UsrRepository extends CrudRepository<Usr, Long> {
	Usr findByUsername(String username);
}