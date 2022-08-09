package com.scaler.blog_app.articles;

import org.springframework.stereotype.Service;

@Service
public class ArticlesService {
    ArticlesRepository articlesRepository;
    public ArticlesService(ArticlesRepository articlesRepository){
        this.articlesRepository = articlesRepository;
    }

    void getAllArticles(){
        articlesRepository.findAll();
    }

    void getArticleById(Long id){
        articlesRepository.findById(id);
    }

    void getArticleByTitle(String slug){
        articlesRepository.findArticleEntityBySlugContaining(slug);
    }

}
