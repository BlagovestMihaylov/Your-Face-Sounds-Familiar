package com.example.YourFaceSoundsFamiliar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Participant implements Serializable {
    @Id
    @Column(nullable = false)
    private String sceneName;
    @Column(nullable = false)
    private String name;
    private String nickname;
    @Column(nullable = false)
    private String jobTitle;
    @Column(nullable = false)
    private int seasonNumber;

    public Participant(String sceneName, String name, String nickname, String jobTitle, int seasonNumber) {
        this.sceneName = sceneName;
        this.name = name;
        this.nickname = nickname;
        this.jobTitle = jobTitle;
        this.seasonNumber = seasonNumber;
    }

    public Participant() {

    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Override
    public String toString() {
        return "Participant{" + "sceneName='" + sceneName + '\'' + ", name='" + name + '\'' + ", nickname='" + nickname + '\'' + ", jobTitle='" + jobTitle + '\'' + ", seasonNumber=" + seasonNumber + '}';
    }
}
