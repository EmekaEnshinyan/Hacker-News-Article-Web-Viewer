package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Article {

    private UUID key;
    private String qKeywords;
    private String qTitle;
    private String qDate;
    //12. when data is inputted in postman as json text, want to send that data to server
    //13. first need to define property into java class like putting @JSONPorperty below
    public Article(@JsonProperty("key") UUID id, String keywords, @JsonProperty("title") String title, String when) { // TODO: <-- what exactly is a UUID
        this.key = id;
        this.qKeywords = keywords;
        this.qTitle = title;
        this.qDate = when;

    }

    //getters
    public UUID getKey() {return key;}

    public String getQKeyword() {return qKeywords;}

    public String getQTitle() {
        return qTitle;
    }

    public String getQDate() {
        return qDate;
    }


    //setters
    public void setKey(UUID id) {
        this.key = id;
    }

    public void setQKeywords(String keywords) {
        this.qKeywords = keywords;
    }

    public void setQTitle(String title) {
        this.qTitle = title;
    }

    public void setQDate(String when) {
        this.qDate = when;
    }
}
