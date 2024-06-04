package com.sg.training.article.domain.mapper;

import com.sg.training.article.domain.Article;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleRowMapper implements RowMapper {

    /**
     * @param resultSet
     * @param rowNum
     * @return
     * @throws SQLException
     */
    @Override
    public Article mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Article article = new Article();
        article.setArticleId(resultSet.getInt("article_id"));
        article.setArticleName(resultSet.getString("article_name"));
        article.setArticleTitle(resultSet.getString("article_title"));
        article.setArticleCategory(resultSet.getString("article_category"));
        return article;
    }
}
