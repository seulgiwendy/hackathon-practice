package com.naver.hackathon.service.specification;

import com.naver.hackathon.domain.Article;
import com.naver.hackathon.domain.UserGroup;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArticleService {

    List<Article> getPagedArticles(UserGroup group, Pageable pageable);
}
