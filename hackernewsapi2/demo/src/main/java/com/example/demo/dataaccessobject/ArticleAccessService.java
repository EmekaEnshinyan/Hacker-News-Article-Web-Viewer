package com.example.demo.dataaccessobject;
import com.example.demo.model.Article;
import org.springframework.stereotype.Repository;
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
        dataB.add(new Article(article.getKey(), article.getQKeyword(), article.getQTitle(), article.getQDate())); // <-- What does this do exactly?
        return 1; // <-- why are we returning 0? initializer for when id is inserted? so we know insertion always works
    }

}
