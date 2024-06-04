package com.sg.training.article.repository.impl;

import com.sg.training.article.domain.Article;
import com.sg.training.article.domain.mapper.ArticleRowMapper;
import com.sg.training.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ArticleRepositoryImpl implements ArticleRepository {
   @Autowired
   JdbcTemplate jdbcTemplate;

   private final String SELECT_ALL_ARTICLE = "SELECT * FROM Article";
   private final String SELECT_ARTICLE_BY_ID = "SELECT * FROM Article WHERE article_id = ?";
   private final String CREATE_ARTICLE = "INSERT INTO ARTICLE Values(?,?,?,?)";
   private final String UPDATE_ARTICLE = "UPDATE Article SET article_title= ? , article_category = ? WHERE article_id = ?";
   private final String DELETE_ARTICLE = "DELETE FROM Article WHERE article_id = ?";
    /**
     * @return
     */
    @Override
    public List<Article> getAllArticles() {
        return jdbcTemplate.query(SELECT_ALL_ARTICLE, new ArticleRowMapper());
    }

    /**
     * @param articleId
     * @return
     */
    @Override
    public Article getArticle(Integer articleId) {
        return (Article) jdbcTemplate.queryForObject(SELECT_ARTICLE_BY_ID, new ArticleRowMapper(), articleId);
    }

    /**
     * @param article
     */
    @Override
    public void addArticle(Article article) {
     jdbcTemplate.update(CREATE_ARTICLE, article.getArticleId(), article.getArticleName(), article.getArticleTitle(), article.getArticleCategory());
    }

    /**
     * @param article
     */
    @Override
    public void updateArticle(Article article) {
        jdbcTemplate.update(UPDATE_ARTICLE, article.getArticleTitle(), article.getArticleCategory(), article.getArticleId());

    }

    /**
     * @param articleId
     */
    @Override
    public void deleteArticle(Integer articleId) {
        jdbcTemplate.update(DELETE_ARTICLE, articleId);
    }

    /**
     * @param articleTitle
     * @param category
     * @return
     */
    @Override
    public boolean articleExist(String articleTitle, String category) {
      String SQL = "SELECT count(*) FROM Article WHERE article_name = ? and article_category = ?";
       int count =  jdbcTemplate.queryForObject(SQL,Integer.class, articleTitle,category);
       if(count==0){
           return false;
       }else {
           return true;
       }
    }
}
