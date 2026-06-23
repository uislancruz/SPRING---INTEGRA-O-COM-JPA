package br.com.uislancruz.events.controller;

import br.com.uislancruz.events.model.Session;
import br.com.uislancruz.events.model.Subscription;
import br.com.uislancruz.events.model.User;
import br.com.uislancruz.events.service.ISubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class SubscriptionController {

    private ISubscriptionService service;

    public SubscriptionController(ISubscriptionService service) {
        this.service = service;
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription) {
        return ResponseEntity.status(20).body(service.addSubscription(subscription));
    }

    @GetMapping("/subscriptions/user/{id}")
    public ResponseEntity<List<Subscription>> getByUser(@PathVariable Integer id) {
        User user = new User();
        user.setUserId(id);
        return ResponseEntity.ok(service.getAllByUser(user));
    }

    @GetMapping("/subscriptions/session/{id}")
    public ResponseEntity<List<Subscription>> getBySession(@PathVariable Integer id) {
        Session session = new Session();
        session.setIdSession(id);
        return ResponseEntity.ok(service.getAllBySession(session));
    }


}
