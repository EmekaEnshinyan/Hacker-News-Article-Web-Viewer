package com.example.hackerNewsApiToWeb.dataaccessobject;

import com.example.hackerNewsApiToWeb.model.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ArticleAccessData implements ArticleDao{
    @Override
    public int insertArticle(UUID uuid, Article article) {
        return 0;
    }

    @Override
    public int addArticle(Article article) {
        return ArticleDao.super.addArticle(article);
    }


    /*public List<Article> selectAllArticles() {
        return List.of(new Article(UUID.randomUUID(), "by", "descendants", "id", "kids", "score", "time", "title", "type", "url"));
    }*/

    @Override
    public int deleteArticleByKey(UUID uuid) {
        return 0;
    }

    @Override
    public int updateArticleByKey(UUID uuid, Article article) {
        return 0;
    }

    @Override
    public Optional<Article> selectArticleByKey(UUID uuid) {
        return Optional.empty();
    }
}
