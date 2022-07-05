package com.mysite.sbb.Dao;

import com.mysite.sbb.Domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository<Article, Long> {
}

