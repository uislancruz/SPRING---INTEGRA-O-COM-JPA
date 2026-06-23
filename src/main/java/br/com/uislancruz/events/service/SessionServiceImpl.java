package br.com.uislancruz.events.service;

import br.com.uislancruz.events.model.Session;
import br.com.uislancruz.events.repo.SessionRepo;

import java.util.List;

public class SessionServiceImpl implements ISessionService{

    private SessionRepo repo;

    public SessionServiceImpl(SessionRepo repo) {
        this.repo = repo;
    }

    @Override
    public Session addSession(Session session) {
        return repo.save(session);
    }

    @Override
    public Session getSessionById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Session not found"));
    }

    @Override
    public List<Session> getAllSessions() {
        return repo.findAll();
    }
}
