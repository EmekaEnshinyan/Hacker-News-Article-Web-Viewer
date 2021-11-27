package com.example.hackerNewsApiToWeb.dataaccessobject;

import com.example.demo.model.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ArticleAccessData implements ArticleDao {
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
        return List.of(new Article(UUID.randomUUID(), "keyword", "title", "date", "deleted", "type", "by", "url"));
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
