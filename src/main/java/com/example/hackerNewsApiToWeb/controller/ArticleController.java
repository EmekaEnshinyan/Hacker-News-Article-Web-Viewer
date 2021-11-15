package com.example.hackerNewsApiToWeb.controller;

import com.example.hackerNewsApiToWeb.model.ArticleParse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

@RestController
@RequestMapping(path = "/hn")
public class ArticleController {

    @CrossOrigin(origins = "http://lcoalhost:8080")
    @GetMapping("/articles")
    public ArticleParse getArticles() throws IOException {

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
        ArticleParse articleParse = objectMapper.readValue(jsonResponseData.toString(), ArticleParse.class);


        System.out.println(articleParse.getBy() + " " + articleParse.getDescendants() + " "
                + articleParse.getId() + " " + String.join(", ", articleParse.getKids()) + " " + articleParse.getScore()
                + " " + articleParse.getTime() + " " + articleParse.getTitle() + " "
                + articleParse.getType() + " " + articleParse.getUrl());

        return articleParse;
    }
}


