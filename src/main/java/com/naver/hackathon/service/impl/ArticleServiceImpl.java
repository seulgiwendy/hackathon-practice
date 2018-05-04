package com.naver.hackathon.service.impl;

import com.naver.hackathon.domain.Article;
import com.naver.hackathon.domain.UserGroup;
import com.naver.hackathon.domain.dto.NewArticleDto;
import com.naver.hackathon.domain.repositories.ArticleRepository;
import com.naver.hackathon.service.specification.ArticleService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> getPagedArticles(UserGroup group, Pageable pageable) {
        return null;
    }

    @Override
    public void saveNewArticle(NewArticleDto dto) {

    }
}
