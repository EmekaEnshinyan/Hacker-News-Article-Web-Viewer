package com.hncopy.HNCopy.service;

import com.hncopy.HNCopy.dataaccessobject.ArticleDao;
import com.hncopy.HNCopy.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//this is where the ??? will implement the ArticleDao interface
//4. here we want to tell Spring that the below class needs to be instantiated so that it can be
//injected in other classes. We use repository injector

@Repository("test dao")
public class ArticleAccessService implements ArticleDao {


    private static List<Article> dataB = new ArrayList<>();

    @Override
    public int addArticle(Article article) {
        dataB.add(new Article(article.getUnique(), article.getBy(), article.getDescendants(), article.getId(),
                (String[]) article.getKids(), article.getScore(), article.getTime(), article.getTitle(), article.getType(), article.getUrl())); // <-- What does this do exactly?
        return 1;
    }

    //19. since new method is made in interface, it needs to be implemented here
    //20. need to return the database since that's where the articles are going to be after POST
    /*@Override
    public List<Article> selectAllArticles() {
        return dataB;
    }*/
    @Override
    public int deleteArticle(Article article) {

        if (dataB.isEmpty()) {
            return 0;
        } else {
            dataB.remove(article);
        }
        return 1;
    }
}