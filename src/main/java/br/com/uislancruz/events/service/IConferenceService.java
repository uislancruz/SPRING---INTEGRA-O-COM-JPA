package br.com.uislancruz.events.service;

import br.com.uislancruz.events.model.Conference;
import br.com.uislancruz.events.model.Session;
import br.com.uislancruz.events.model.Subscription;
import br.com.uislancruz.events.model.User;

import java.util.List;

public interface IConferenceService {

    public Conference addConference(Conference conference);
    public Conference getConferenceById(Integer id);
    public List<Conference> getAllConferences();
}
