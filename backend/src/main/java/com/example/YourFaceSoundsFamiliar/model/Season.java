package com.example.YourFaceSoundsFamiliar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class Season implements Serializable {

    @Id
    @Column(nullable = false)
    private int number;
    @Column(nullable = false)
    private int participantCount;
    @Column(nullable = false)
    private int episodeCount;

    public Season(int number, int participantCount, int episodeCount)
    {
        this.number = number;
        this.participantCount = participantCount;
        this.episodeCount = episodeCount;
    }

    public Season()
    {
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getParticipantCount()
    {
        return participantCount;
    }

    public void setParticipantCount(int participantCount)
    {
        this.participantCount = participantCount;
    }

    public int getEpisodeCount()
    {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount)
    {
        this.episodeCount = episodeCount;
    }
}
