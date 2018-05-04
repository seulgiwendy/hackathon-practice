package com.naver.hackathon.controllers

import com.naver.hackathon.domain.Article
import com.naver.hackathon.service.specification.AccountService
import com.naver.hackathon.service.specification.ArticleService
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
open class ApiController(val accountService: AccountService, val articleService: ArticleService) {

    @GetMapping("/articles")
    @PreAuthorize("hasRole('ROLE_USER')")
    fun getArticles(): List<Article>? {

        return null
    }
}