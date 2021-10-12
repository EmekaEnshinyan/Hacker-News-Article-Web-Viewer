package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class pObject {

    private UUID key;
    private String qKeyword;
    private String qTitle;
    private String qDate;
    //12. when data is inputted in postman as json text, want to send that data to server
    //13. first need to define property into java class like putting @JSONPorperty below
    public pObject(@JsonProperty("key") UUID key, String qKeyword, @JsonProperty("title") String qTitle, String qDate) { // TODO: <-- what exactly is a UUID
        this.key = key;
        this.qKeyword = qKeyword;
        this.qTitle = qTitle;
        this.qDate = qDate;

    }

    public UUID getKey() {
        return key;
    }
    public String getQKeyword(){
        return qKeyword;
    }
    public String getQTitle(){
        return qTitle;
    }
    public String getQDate(){
        return qDate;
    }
    public void setKey(UUID key) {
        this.key = key;
    }
    public void setQKeywords(String qKeyword){
        this.qKeyword = qKeyword;
    }
    public void setQTitle(String qTitle){
        this.qTitle = qTitle;
    }

}
