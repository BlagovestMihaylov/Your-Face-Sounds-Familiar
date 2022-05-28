package com.example.YourFaceSoundsFamiliar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

@Entity
@IdClass(RoleID.class)
public class Role implements Serializable {
    @Id
    @Column(nullable = false)
    private long participantId;
    @Id
    @Column(nullable = false)
    private Date episodeDate;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String originalPerformer;
    @Column(nullable = false)
    private int points;

    public Role() {
    }

    public Role(long participantId, Date episodeDate, String title, String originalPerformer, int points)
    {
        this.participantId = participantId;
        this.episodeDate = episodeDate;
        this.title = title;
        this.originalPerformer = originalPerformer;
        this.points = points;
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

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getOriginalPerformer()
    {
        return originalPerformer;
    }

    public void setOriginalPerformer(String originalPerformer)
    {
        this.originalPerformer = originalPerformer;
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }
}
