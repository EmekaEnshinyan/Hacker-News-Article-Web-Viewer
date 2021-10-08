//this interface is an abstract class thaqt is used to hide details of objects
//using the implements keyword
//set constraints for anyone who wants to use interface
package com.example.demo.dataaccessobject;

import com.example.demo.model.Article;

import java.util.*;

public interface ArticleDao {
    //when this int typed method is implemented, can insert the article ID using injection
    int insertArticle(UUID id, Article article);
    //here generates random UUIDS/IDs ?if? article does not have one
    default int addArticle(Article article){ // <-- why do you have to write default? Isn't it default already if no modifier specified?
        UUID id = UUID.randomUUID();
        return insertArticle(id, article);
    }
    //18. now endpoint is needed now that request/post in postman working
    List<Article> selectAllArticles();


}
