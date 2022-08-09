package com.scaler.blog_app.articles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesRepository extends JpaRepository<ArticleEntity, Long> {
    List<ArticleEntity> findArticleEntityBySlugContaining(String slug);
}
