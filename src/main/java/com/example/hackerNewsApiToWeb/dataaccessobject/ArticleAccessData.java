package com.example.hackerNewsApiToWeb.dataaccessobject;

import com.example.hackerNewsApiToWeb.model.Article;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ArticleAccessData implements ArticleDao{

    @Override
    public Optional<Article> selectArticleByKey(UUID unique){
        return Optional.empty();
    }

    @Override
    public int insertArticle(UUID unique, Article article) {
        return 0;
    }

    @Override
    public int addArticle(Article article) {
        return ArticleDao.super.addArticle(article);
    }

    @Override
    public int deleteArticleByKey(UUID unique) {
        return 0;
    }

    @Override
    public int updateArticleByKey(UUID unique, Article article) {
        return 0;
    }



}
