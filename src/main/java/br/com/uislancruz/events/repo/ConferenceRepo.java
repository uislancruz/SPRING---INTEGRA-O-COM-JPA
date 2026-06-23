package br.com.uislancruz.events.repo;

import br.com.uislancruz.events.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer> {
}
