package com.example.YourFaceSoundsFamiliar.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value = "Host")
public class Host extends ActingPerson {

    @Column(nullable = false)
    private int seasonNumber;

    public int getSeasonNumber() {
        return seasonNumber;
    }


    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Host(String sceneName, String name, String nickname) {
        super(sceneName, name, nickname);
    }

    public Host() {
    }

    @Override
    public String toString() {
        return super.toString();
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
}
