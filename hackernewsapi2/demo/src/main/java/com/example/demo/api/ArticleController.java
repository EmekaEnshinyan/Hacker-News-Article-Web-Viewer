package com.example.demo.api;

import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

//Here is where the API is implemented
//8. now add @autowired here to inject the service into constructor below

public class ArticleController {
    //1. we need a reference to actual service
    private final ArticleService articleService;
    //2. need  constructor sor controller
    @Autowired
    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }
    //3. now a method that adds a person. here you can throw excpetion if fails?
    public void addArticle(Article article){
        articleService.addArticle(article);
    }

}
