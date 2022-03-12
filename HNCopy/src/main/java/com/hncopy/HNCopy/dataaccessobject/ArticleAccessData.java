package com.hncopy.HNCopy.dataaccessobject;

import com.hncopy.HNCopy.model.Article;
import org.springframework.stereotype.Repository;

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
