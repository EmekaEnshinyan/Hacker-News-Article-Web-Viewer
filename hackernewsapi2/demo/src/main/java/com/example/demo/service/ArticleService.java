package com.example.demo.service;

import com.example.demo.dataaccessobject.ArticleDao;
import com.example.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
 //5. here we need to tell Spring that this class is the service injection???
//because if we don't the constructor will not know what to do???
@Service
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
    public int addArticle(Article article){
        //this now allows us to generate an article id if we want to
        return articleDao.addArticle(article); // <-- recursive method

    }
}
