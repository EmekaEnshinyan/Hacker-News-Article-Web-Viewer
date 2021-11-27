package com.example.hackerNewsApiToWeb.controller;

import com.example.hackerNewsApiToWeb.model.Article;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static java.lang.System.in;
//heroku test
@RestController
//CORS Policy fix
@CrossOrigin
@RequestMapping(path = "/hn")
public class ArticleController {


    @GetMapping("/articles")
    public Article getArticles() throws IOException {

        URL getUrl = new URL("https://hacker-news.firebaseio.com/v0/item/29042728.json?print=pretty");
        //Top 500 Articles
        // https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty
        //Proxy Article
        // https://hacker-news.firebaseio.com/v0/item/29042728.json?print=pretty
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        //sets request

        //gets response
        //int responseCode = connection.getResponseCode();
        //if connection (200 OK) made, data buffered
        BufferedReader art = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuffer jsonResponseData = new StringBuffer();
        String readLine = null;

        //appends data from response line by line
        while ((readLine = art.readLine()) != null) {
            jsonResponseData.append(readLine);
        }
        in.close();


        //checks to see if JSON data cluster was a complex object or just an array

        ObjectMapper objectMapper = new ObjectMapper();
        //parses the JSON data containing key/value pairs
        Article article = objectMapper.readValue(jsonResponseData.toString(), Article.class);


        System.out.println(article.getBy() + " " + article.getDescendants() + " "
                + article.getId() + article.getScore()
                + " " + article.getTime() + " " + article.getTitle() + " "
                + article.getType() + " " + article.getUrl());

        return article;
    }
}


