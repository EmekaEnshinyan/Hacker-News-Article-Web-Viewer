package com.example.hackerNewsApiToWeb.controller;

import com.example.hackerNewsApiToWeb.model.Article;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArticleControllerTest{

    @Autowired
    private ArticleController controller;
    @Test
    public void contextLoads() throws Exception{
        controller.requestArticle("https://hacker-news.firebaseio.com/v0/item/29042728.json?print=pretty");

    }
}