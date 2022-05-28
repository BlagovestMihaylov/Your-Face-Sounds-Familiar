package com.example.YourFaceSoundsFamiliar.model;

import java.io.Serializable;
import java.util.Date;

public class RoleID implements Serializable {
    private long participantId;
    private Date episodeDate;

    public RoleID() {
    }

    public RoleID(long participantId, Date episodeDate)
    {
        this.participantId = participantId;
        this.episodeDate = episodeDate;
    }

    public long getParticipantId()
    {
        return participantId;
    }

    public void setParticipantId(long participantId)
    {
        this.participantId = participantId;
    }

    public Date getEpisodeDate()
    {
        return episodeDate;
    }

    public void setEpisodeDate(Date episodeDate)
    {
        this.episodeDate = episodeDate;
    }
}
