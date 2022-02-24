//this interface is an abstract class thaqt is used to hide details of objects
//using the implements keyword
//set constraints for anyone who wants to use interface
package com.example.hackerNewsApiToWeb.dataaccessobject;

import com.example.hackerNewsApiToWeb.model.Article;

import java.util.Optional;
import java.util.UUID;

public interface ArticleDao {
    int addArticle(Article article);
    int deleteArticle(Article article);



}
