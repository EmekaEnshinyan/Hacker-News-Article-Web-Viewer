//this interface is an abstract class thaqt is used to hide details of objects
//using the implements keyword
//set constraints for anyone who wants to use interface
package com.example.demo.dataaccessobject;

import com.example.demo.model.Article;

import java.util.*;
//this is an interface that acts as an abstract class that can have more than one abstract methods
public interface ArticleDao {
    //when this int typed method is implemented, can insert the article ID using injection
    //this is an ABSTRACT METHOD, which has no body
    int insertArticle(UUID key, Article article);
    //here generates random UUIDS/IDs ?if? article does not have one
    //another abstract method
    default int addArticle(Article article){ // <-- why do you have to write default? Isn't it default already if no modifier specified?
        UUID key = UUID.randomUUID();
        return insertArticle(key, article);
    }
    //18. now endpoint is needed now that request/post in postman working. so make endpoints for all actions
    List<Article> selectAllArticles();
    //24. delete
    int deleteArticleByKey(UUID key);
    //25. update/rewrite
    int updateArticleByKey(UUID key, Article article);
    Optional<Article> selectArticleByKey(UUID key);




}
