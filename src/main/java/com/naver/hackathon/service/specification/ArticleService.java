package com.naver.hackathon.service.specification;

import com.naver.hackathon.domain.Article;
import com.naver.hackathon.domain.UserGroup;
import com.naver.hackathon.domain.dto.NewArticleDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArticleService {

    List<Article> getPagedArticles(UserGroup group, Pageable pageable);

    void saveNewArticle(NewArticleDto dto);
}
