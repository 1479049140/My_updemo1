package com.offcn.Bean;

public class maoyan {
    private int id;
    private String img;
    private String title;
    private String actor;
    private String date;
    private String score;

    public maoyan() {
    }

    public maoyan(String img, String title, String actor, String date, String score) {
        this.img = img;
        this.title = title;
        this.actor = actor;
        this.date = date;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "maoyan{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", title='" + title + '\'' +
                ", actor='" + actor + '\'' +
                ", date='" + date + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
