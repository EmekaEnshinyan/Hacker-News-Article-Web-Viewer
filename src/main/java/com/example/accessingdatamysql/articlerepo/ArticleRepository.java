package com.example.accessingdatamysql.articlerepo;

import com.example.accessingdatamysql.model.Article;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.model.Article;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}