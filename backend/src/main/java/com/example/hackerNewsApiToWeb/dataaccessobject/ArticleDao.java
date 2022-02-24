//this interface is an abstract class thaqt is used to hide details of objects
//using the implements keyword
//set constraints for anyone who wants to use interface
package com.example.hackerNewsApiToWeb.dataaccessobject;

import com.example.hackerNewsApiToWeb.model.Article;

import java.util.Optional;
import java.util.UUID;

//this is an interface that acts as an abstract class that can have more than one abstract methods
public interface ArticleDao {
    //when this int typed method is implemented, can insert the article ID using injection
    //this is an ABSTRACT METHOD, which has no body
    int insertArticle(UUID unique, Article article);
    //here generates random UUIDS/IDs ?if? article does not have one
    //another abstract method
    default int addArticle(Article article){ // <-- why do you have to write default? Isn't it default already if no modifier specified?
        UUID unique = UUID.randomUUID();
        return insertArticle(unique, article);
    }
    //Answer: A 'default' method is 'public' with some extra stuff.  The difference between public and default is that
    //default methods are predefined in the interface. All classes that implement the interface get the function for free.
    //Public methods are declared in the interface and must be defined in all classes that implement the interface.*/

    //19. since new method is made in interface, it needs to be implemented here
    //20. need to return the database since that's where the articles are going to be after POST

   /*List<Article> selectAllArticles();*/

    //18. now endpoint is needed now that request/post in postman working. so make endpoints for all actions
    //24. delete
    int deleteArticleByKey(UUID unique);
    //25. update/rewrite
    int updateArticleByKey(UUID unique, Article article);
    Optional<Article> selectArticleByKey(UUID unique);




}
