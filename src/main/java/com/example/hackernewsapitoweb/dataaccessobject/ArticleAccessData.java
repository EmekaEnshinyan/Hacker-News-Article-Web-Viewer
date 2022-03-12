package com.example.hackernewsapitoweb.dataaccessobject;

import com.example.hackernewsapitoweb.model.Article;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ArticleAccessData implements ArticleDao{
    @Override
    public int addArticle(Article article) {
        return 0;
    }

    @Override
    public int deleteArticle(Article article){
        return 0;
    }

}
