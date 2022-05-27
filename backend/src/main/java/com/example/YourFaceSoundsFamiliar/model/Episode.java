package com.example.YourFaceSoundsFamiliar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Episode implements Serializable {
    @Id
    @Column(nullable = false, unique = true)
    private Date date;
    @Column(nullable = false)
    int number;
    @Column(nullable = false)
    int seasonNumber;

    public Episode(Date date, int number, int seasonNumber) {
        this.date = date;
        this.number = number;
        this.seasonNumber = seasonNumber;
    }

    public Episode() {

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "date=" + date +
                ", number=" + number +
                ", seasonNumber=" + seasonNumber +
                '}';
    }
}
