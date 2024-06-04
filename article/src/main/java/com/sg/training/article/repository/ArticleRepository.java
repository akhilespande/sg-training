package com.sg.training.article.repository;

import com.sg.training.article.ArticleApplication;
import com.sg.training.article.domain.Article;

import java.util.List;

public interface ArticleRepository {
    List<Article> getAllArticles();
    Article getArticle(Integer articleId);
    void addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(Integer articleId);
    boolean articleExist(String articleTitle, String category);
}
