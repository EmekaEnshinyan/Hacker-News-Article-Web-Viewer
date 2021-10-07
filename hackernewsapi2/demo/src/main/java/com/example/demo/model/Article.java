package com.example.demo.model;

import java.util.*;

public class Article {

    private UUID key;
    private String qKeywords;
    private String qTitle;
    private String qDate;

    public Article(UUID num, String name, String url, String when) {
        this.key = num;
        this.qKeywords = name;
        this.qTitle = url;
        this.qDate = when;

    }

    //getters
    public UUID getKey() {
        return key;
    }

    public String getQKeyword() {
        return qKeywords;
    }

    public String getQTitle() {
        return qTitle;
    }

    public String getQDate() {
        return qDate;
    }
    //setters
    public void setKey(UUID key) {
        this.key = key;
    }

    public void setQKeywords(String qKeywords) {
        this.qKeywords = qKeywords;
    }

    public void setQTitle(String qTitle) {
        this.qTitle = qTitle;
    }

    public void setQDate(String qDate) {
        this.qDate = qDate;
    }
}
