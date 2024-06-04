package com.sg.training.article.service;

import com.sg.training.article.domain.Article;

import java.util.List;

public interface ArticleService {
    List<Article> selectAllArticle();
    Article selectArticleByID(Integer articleId);
    boolean addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(Integer articleId);
}
