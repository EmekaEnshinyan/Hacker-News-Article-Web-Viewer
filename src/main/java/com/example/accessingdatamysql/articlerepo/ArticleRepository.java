package com.example.accessingdatamysql.articlerepo;

import com.example.accessingdatamysql.model.Article;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.model.Article;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {

    Article findById(int id);

}