package com.example.YourFaceSoundsFamiliar.model;

import java.io.Serializable;
import java.util.Date;

public class RoleID implements Serializable {
    private String participantSceneName;
    private Date episodeDate;

    public RoleID() {
    }

    public RoleID(String participantSceneName, Date episodeDate) {
        this.participantSceneName = participantSceneName;
        this.episodeDate = episodeDate;
    }

    public String getParticipantSceneName() {
        return participantSceneName;
    }

    public void setParticipantSceneName(String participantSceneName) {
        this.participantSceneName = participantSceneName;
    }

    public Date getEpisodeDate() {
        return episodeDate;
    }

    public void setEpisodeDate(Date episodeDate) {
        this.episodeDate = episodeDate;
    }
}
