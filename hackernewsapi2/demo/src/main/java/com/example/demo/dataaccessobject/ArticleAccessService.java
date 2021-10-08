package com.example.demo.dataaccessobject;
import com.example.demo.api.ArticleController;
import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
//TODO //###MAY NOT WORK BECAUSE OF PACKAGE NAME??###
import java.util.*;
//this is where the ??? will implement the ArticleDao interface
//4. here we want to tell Spring that the below class needs to be instantiated so that it can be
//injected in other classes. We use repository injector
@Repository("test dao")
public class  ArticleAccessService implements ArticleDao {

    //may not want to use a simple list? Perhaps ArrayList is better?
    /*private static void arrList(ArrayList arrOne){
        ArrayList<Article> arrTwo = new ArrayList<>();
        for(Article i: arrTwo) {
            arrOne.add(arrTwo.get(0));
        }
    }*/
    private static List<Article> dataB = new ArrayList<>(); //<-- why can you not put void here? returning something?
    //use enhanced for loop since dealing with collection



    //now need to implement methods from interface.
    @Override /*override requires
    corresponding method in supertype (in this case it's going to be the one in the interface.) Does this tell
    the compiler to call this method instead of interface one?*/
    public int insertArticle(UUID key, Article article){
        dataB.add(new Article(key, article.getQKeyword(), article.getQTitle(), article.getQDate())); // <-- What does this do exactly?
        return 1; // <-- why are we returning 0? initializer for when id is inserted? so we know insertion always works
    }
    //19. since new method is made in interface, it needs to be implemented here
    //20. need to return the database since that's where the articles are going to be after POST
    @Override
    public List<Article> selectAllArticles(){
        return dataB;
    }
    //22. create a method that can delete an article
    @Override
    public int deleteArticleByKey(UUID key){
        return 0;
    }
    @Override
    public int updateArticleByKey(UUID key, Article article) {
        return 0;
    }
    @Override
    //26. in order to search in DB article by key first, stream DB
    public Optional<Article> selectArticleByKey(UUID key) {
        return dataB.stream().filter(article -> article.getKey().equals(key)).findFirst();
    }


}
