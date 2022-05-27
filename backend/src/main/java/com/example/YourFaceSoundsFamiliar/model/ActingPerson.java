package com.example.YourFaceSoundsFamiliar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ActingPerson implements Serializable {
    @Id
    @Column(nullable = false)
    private String sceneName;
    @Column(nullable = false)
    private String name;
    private String nickname;

    public ActingPerson(String sceneName, String name, String nickname) {
        this.sceneName = sceneName;
        this.name = name;
        this.nickname = nickname;
    }

    public ActingPerson() {

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

    @Override
    public String toString() {
        return "ActingPerson{" +
                "sceneName='" + sceneName + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
