package br.com.uislancruz.events.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "tbl_session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id")
    private Integer idSession;
    @Column(name = "title", length = 255, nullable = false)
    private String title;
    @Column(name = "start_date", nullable = false)
    private LocalDate starDate;
    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;
    @ManyToOne
    @JoinColumn(name = "tbl_conference_id_conference", nullable = false)
    private Conference conference;


    public Integer getIdSession() {
        return idSession;
    }

    public void setIdSession(Integer idSession) {
        this.idSession = idSession;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalDate getStarDate() {
        return starDate;
    }

    public void setStarDate(LocalDate starDate) {
        this.starDate = starDate;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

}
