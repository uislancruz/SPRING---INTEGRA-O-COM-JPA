package br.com.uislancruz.events.repo;

import br.com.uislancruz.events.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepo extends ListCrudRepository<Session, Integer> {
}
