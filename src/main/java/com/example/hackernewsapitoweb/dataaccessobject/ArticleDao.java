//this interface is an abstract class thaqt is used to hide details of objects
//using the implements keyword
//set constraints for anyone who wants to use interface
package com.example.hackernewsapitoweb.dataaccessobject;

import com.example.hackernewsapitoweb.model.Article;

import java.util.Optional;
import java.util.UUID;

//this is an interface that acts as an abstract class that can have more than one abstract methods
public interface ArticleDao {
    //Put
    int addArticle(Article article);
    //Delete
    int deleteArticle(Article article);

    //Post
    //int updateArticle(Article article);

    //GET
}
