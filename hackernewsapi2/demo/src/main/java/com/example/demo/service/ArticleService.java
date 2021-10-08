package com.example.demo.service;

import com.example.demo.dataaccessobject.ArticleDao;
import com.example.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//5. here we need to tell Spring that this class is the service injection???
//because if we don't the constructor will not know what to do???
//8. now we should replace @service for @restcontroller so that we can use restful services like get, put, delete
@RestController
public class ArticleService {
    private final ArticleDao articleDao;
    //need constructor to allow above var ArticleDao to be resolved
     //6. now that @Service, we are injecting here and use @AutoWired to ?wire? into the ArticleDao interface
     @Autowired
     //7. since there can be more than one interface of ArticleDao, we need to make sure we're working with "this" one
     //and we use @Qualifier within the constructor to do it
    public ArticleService(@Qualifier("test dao") ArticleDao articleDao){
        this.articleDao = articleDao;
    }
    //here we want to create a method to insert a new article
    //9. want to make a POST request which adds a resource to server (whereas GET is for retrieving data from server)
    @PostMapping
    public int addArticle(Article article){
        //this now allows us to generate an article id if we want to
        return articleDao.addArticle(article); // <-- recursive method
    //10. can now use the application Postman to serve as our client
    //11. when workspace made, try sending post request using localhost:8080
    }
    //MAY NEED TO CONSULT METHOD OVERLOADING
    //20. now need to connect to implemented method selectAllArticles() that is connected to interface
    public List<Article> getAllArticles(){
         return articleDao.selectAllArticles();
    }
    public Optional<Article> selectArticleByKey(UUID key){
         return articleDao.selectArticleByKey(key);
    }

}
