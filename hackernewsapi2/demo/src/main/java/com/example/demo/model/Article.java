package com.example.demo.model;
//2. make the Article body with the proper vars, constructor, getters k(may not need setters)
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.net.URL;
import java.util.*;

public class Article {
//TODO: rename all variables and get rid of the "q" so that it's easier to deal with
//TODO: check if final keyword should be used in the article class
    private final UUID key;
    private final String deleted;
    private final String type;
    private final String by;
    //not sure about this one
    private final String url;

    private final String qKeyword;
    //the @notblank prevents the requests in postman to accept a blank POST
    @NotBlank
    private final String qTitle;
    private final String qDate;
    //12. when data is inputted in postman as json text, want to send that data to server
    //13. first need to define property into java class like putting @JSONPorperty below
    public Article(@JsonProperty("key") UUID key, @JsonProperty("keyword") String qKeyword, @JsonProperty("title") String qTitle,
                   @JsonProperty("date") String qDate, @JsonProperty("deleted") String deleted,
                   @JsonProperty("type") String type, @JsonProperty("by") String by, @JsonProperty("url") String url) {
        this.key = key;
        this.qKeyword = qKeyword;
        this.qTitle = qTitle;
        this.qDate = qDate;
        this.deleted = deleted;
        this.type = type;
        this.by = by;
        this.url = url;

    }

    public String getDeleted() {
        return deleted;
    }

    public String getType() {
        return type;
    }

    public String getBy() {
        return by;
    }

    public String getUrl() {
        return url;
    }

    public UUID getKey() {
        return key;
    }

    public String getQKeyword() {
        return qKeyword;
    }

    public String getQTitle() {
        return qTitle;
    }

    public String getQDate() {
        return qDate;
    }
}
