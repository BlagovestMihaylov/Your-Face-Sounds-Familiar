package com.example.YourFaceSoundsFamiliar.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Jury extends ActingPerson {

    @Column(nullable = false)
    private int episodeNumber;

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public Jury() {
        super();
    }

    public Jury(String sceneName, String name, String nickname) {
        super(sceneName, name, nickname);
    }

    @Override
    public String getSceneName() {
        return super.getSceneName();
    }

    @Override
    public void setSceneName(String sceneName) {
        super.setSceneName(sceneName);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getNickname() {
        return super.getNickname();
    }

    @Override
    public void setNickname(String nickname) {
        super.setNickname(nickname);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
