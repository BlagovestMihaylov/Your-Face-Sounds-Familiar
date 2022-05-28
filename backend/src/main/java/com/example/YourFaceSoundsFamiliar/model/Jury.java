package com.example.YourFaceSoundsFamiliar.model;

import javax.persistence.*;

@Entity
public class Jury {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String sceneName;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String nickname;
    @Column(nullable = false)
    private int episodeNumber;

    public Jury(String sceneName, String name, String nickname, int episodeNumber)
    {
        this.sceneName = sceneName;
        this.name = name;
        this.nickname = nickname;
        this.episodeNumber = episodeNumber;
    }

    public Jury()
    {
    }

    public String getSceneName()
    {
        return sceneName;
    }

    public void setSceneName(String sceneName)
    {
        this.sceneName = sceneName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public int getEpisodeNumber()
    {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber)
    {
        this.episodeNumber = episodeNumber;
    }
}
