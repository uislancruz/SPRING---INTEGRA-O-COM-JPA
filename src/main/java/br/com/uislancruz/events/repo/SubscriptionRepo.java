package br.com.uislancruz.events.repo;

import br.com.uislancruz.events.model.Session;
import br.com.uislancruz.events.model.Subscription;
import br.com.uislancruz.events.model.SubscriptionID;
import br.com.uislancruz.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID> {
    public List<Subscription> findByIdUser(User user);
    public List<Subscription> findByIdSession(Session session);
}
