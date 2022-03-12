//this interface is an abstract class thaqt is used to hide details of objects
//using the implements keyword
//set constraints for anyone who wants to use interface
package com.hncopy.HNCopy.dataaccessobject;


import com.hncopy.HNCopy.model.Article;

public interface ArticleDao {
    //Put
    int addArticle(Article article);
    //Delete
    int deleteArticle(Article article);

    //Post
    //int updateArticle(Article article);

    //GET



}
