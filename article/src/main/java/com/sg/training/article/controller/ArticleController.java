package com.sg.training.article.controller;

import com.sg.training.article.domain.Article;
import com.sg.training.article.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("v1/user")
public class ArticleController {
    private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
    private ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
    this.articleService = articleService;
    }


    @GetMapping("article/{id}")
    ResponseEntity<Article> getArticle(@PathVariable("id") Integer id){
        log.info("getting articles for id [{}]", id);
        Article article = articleService.selectArticleByID(id);
       return new ResponseEntity<Article>(article, HttpStatus.OK);
    }

    @GetMapping("articles")
    ResponseEntity<List<Article>> getArticles(){
        log.info("getting all the articles ");
        List<Article> articleList = articleService.selectAllArticle();
        return  new ResponseEntity<List<Article>>(articleList,HttpStatus.OK );
    }

    @PostMapping("article")
    ResponseEntity<String> addArticle(@RequestBody Article article){
        boolean flag = articleService.addArticle(article);

        if(flag == false){
            return new ResponseEntity<>("There is an already article exists..", HttpStatus.CONFLICT);
        }else {
            return new ResponseEntity<>("article added ...", HttpStatus.OK);
        }
    }

    @PutMapping("article")
    ResponseEntity<String> updateArticle(@RequestBody Article article){
        articleService.updateArticle(article);
        return new ResponseEntity<>("article updated...", HttpStatus.NO_CONTENT);

    }

    @DeleteMapping("article/{id}")
    ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id){
        articleService.deleteArticle(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
