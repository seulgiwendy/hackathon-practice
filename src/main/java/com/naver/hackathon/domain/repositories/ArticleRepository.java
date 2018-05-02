package com.naver.hackathon.domain.repositories;

import com.naver.hackathon.domain.Article;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {


}
