package com.example.demo.api;

import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//Here is where the API is implemented

//17. now need to define pathway/url of postman so they can connect

//14. add @restcontroller for creating restful web services.
//once response body generated from handler method, converts response to JSON or XML file
//###MAKE SURE THAT YOU DO NOT PUT LOCALHOST:8080 WITHIN THE URL REQUEST. IT CANNOT STAND AS A DESTINATION###
@RequestMapping("api/test/article")
@RestController
public class ArticleController {
    //1. we need a reference to actual service
    private final ArticleService articleService;
    //2. need  constructor for controller
    //8. now add @autowired here to inject the service into constructor below
    @Autowired
    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }
    //3. now a method that adds a person. here you can throw excpetion if fails?
    //15. here @request body is placed so server is receiving the JSON body from postman
    @PostMapping
    //16. will take the request body and put it in article. essentially turning the JSON body INTO an article object
    public void addArticle(@RequestBody Article article){
        articleService.addArticle(article);
    }
    //21. now need a method that will serve as the get request
    @GetMapping
    public List<Article> getAllArticles(){
        return articleService. getAllArticles(); //<-- why do we need not use this.? isn't article service modified as private?
    }
    //23. make sure to add a get request for a single json object putting pathvar in the method params
    @GetMapping(path = "{key}")
    //27. what this essentially does is that with the custom annotation: copy key and get article back for GET request
    //28. the second function of the method is grabbing the key generated and turning it into a UUID
        //UUID is a class that represents an immutable universaslly unique identifier that's in 128-bit value
            //it provides a unique identity to any collection of information
    public Article getArticleByKey(@PathVariable("key") UUID key){
        return articleService.selectArticleByKey(key)
                .orElse(null);
    }
}
