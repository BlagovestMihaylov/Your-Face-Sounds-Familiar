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

}
