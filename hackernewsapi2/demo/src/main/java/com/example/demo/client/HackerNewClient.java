package com.example.demo.client;

import com.example.demo.model.Article;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class HackerNewClient {

    Article art = new Article(UUID.randomUUID(), "mentor", "fun times", "10/20/21", "deleted","", "", "");
    public List<Article> getAllArticles(){


        return //Arrays.asList(new String[]{"foo", "bar"});\
         Arrays.asList(art);

    }


}
