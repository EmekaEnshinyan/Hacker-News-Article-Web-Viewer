package com.example.hackerNewsApiToWeb.model;


import org.springframework.beans.factory.annotation.Autowired;
//TODO: going to remove kids field and test
public class Article {
    private String by;
    private int descendants;
    private int id;
    private int score;
    private int time;
    private String title;
    private String type;
    private String url;

    //12. when data is inputted in postman as json text, want to send that data to server
    //13. first need to define property into java class like putting @JSONPorperty below
    @Autowired
    public Article(String by, int descendants, int id, int score, int time, String title, String type, String url) {
        super();
        this.by = by;
        this.descendants = descendants;
        this.id = id;
        this.score = score;
        this.time = time;
        this.title = title;
        this.type = type;
        this.url = url;
    }
    @Autowired
    public Article(){}

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public int getDescendants() {
        return descendants;
    }

    public void setDescendants(int descendants) {
        this.descendants = descendants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
