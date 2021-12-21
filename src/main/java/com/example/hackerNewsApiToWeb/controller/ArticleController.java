package com.example.hackerNewsApiToWeb.controller;

import com.example.hackerNewsApiToWeb.model.Article;
import com.example.hackerNewsApiToWeb.service.ArticleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

import static com.example.hackerNewsApiToWeb.parse.Parse.hackerNewsJsonObjectParse;
import static java.lang.System.in;
//heroku test
@RestController
//CORS Policy fix
@CrossOrigin
@RequestMapping(path = "/hn")
public class ArticleController {

/*  private final ArticleService articleService;

   @Autowired
    public ArticleController(@RequestBody ArticleService articleService) {
        this.articleService = articleService;
    }*/

    @GetMapping("/articles")
    public Article requestArticles() throws IOException {
        return hackerNewsJsonObjectParse();
    }
}
