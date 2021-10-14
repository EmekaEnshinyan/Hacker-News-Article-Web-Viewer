package com.example.demo.dataaccessobject;

import com.example.demo.model.Article;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
//39. Suppose we wanted to make a PostGres relational database which would be the primary data store
public class AccessArticleData implements ArticleDao {
    @Override
    public int insertArticle(UUID key, Article article) {
        return 0;
    }

    @Override
    public int addArticle(Article article) {
        return ArticleDao.super.addArticle(article);
    }

    @Override
    public List<Article> selectAllArticles() {
        return null;
    }

    @Override
    public int deleteArticleByKey(UUID key) {
        return 0;
    }

    @Override
    public int updateArticleByKey(UUID key, Article article) {
        return 0;
    }

    @Override
    public Optional<Article> selectArticleByKey(UUID key) {
        return Optional.empty();
    }
}
