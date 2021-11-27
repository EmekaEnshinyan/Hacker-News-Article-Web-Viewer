package com.example.hackerNewsApiToWeb.service;


import com.example.hackerNewsApiToWeb.dataaccessobject.ArticleDao;
import com.example.hackerNewsApiToWeb.model.Article;
import com.example.hackerNewsApiToWeb.dataaccessobject.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    private final ArticleDao ArticleDao;
    //private final HackerNewClient hackerNewsClient;
    //need constructor to allow above var ArticleDao to be resolved
    //6. now that @Service, we are injecting here and use @AutoWired to ?wire? into the ArticleDao interface
    @Autowired
    //7. since there can be more than one interface of ArticleDao, we need to make sure we're working with "this" one
    //and we use @Qualifier within the constructor to do it
    public ArticleService(@Qualifier("test dao") ArticleDao ArticleDao){
        this.ArticleDao = ArticleDao;
    }
    //here we want to create a method to insert a new Article
    //9. want to make a POST request which adds a resource to server (whereas GET is for retrieving data from server)
    @PostMapping
    public int addArticle(Article Article){
        //this now allows us to generate an Article id if we want to
        return ArticleDao.addArticle(Article); // <-- recursive method
        //10. can now use the application Postman to serve as our client
        //11. when workspace made, try sending post request using localhost:8080
    }
    //MAY NEED TO CONSULT METHOD OVERLOADING
    //20. now need to connect to implemented method selectAllArticles() that is connected to interface
    public List<Article> getAllArticles(){
        return ArticleDao.selectAllArticles();
    }
    public Optional<Article> selectArticleByKey(UUID key){
        return ArticleDao.selectArticleByKey(key);
    }

    //27. need to put same method here in service
    public Optional<Article> getArticleByKey(UUID key){
        return ArticleDao.selectArticleByKey(key);
    }

    //35. now place the delete handler in the controller class
    public int deleteArticle(UUID key){
        return ArticleDao.deleteArticleByKey(key);
    }
    //36. when updating Article, we are making a new Article?
    public int updateArticle(UUID key, Article Article){ // <-- this almost looks like a new Article is being made, but there is no logic that actually REWRITES the Article
        return ArticleDao.updateArticleByKey(key, Article);
    }

}
