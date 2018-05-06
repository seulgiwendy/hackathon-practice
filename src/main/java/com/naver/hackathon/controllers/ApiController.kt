package com.naver.hackathon.controllers

import com.naver.hackathon.domain.Article
import com.naver.hackathon.domain.NewArticleEvent
import com.naver.hackathon.service.specification.AccountService
import com.naver.hackathon.service.specification.ArticleService
import org.springframework.http.MediaType
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.util.function.Tuple2
import java.time.Duration
import java.util.stream.Stream

@RestController
@RequestMapping("/api/v1")
open class ApiController(val accountService: AccountService, val articleService: ArticleService) {

    @GetMapping("/articles")
    fun getArticles(): List<Article>? {

        return null
    }

    @GetMapping("/notifications", produces = [MediaType.APPLICATION_STREAM_JSON_VALUE])
    fun getNotifications(): Flux<String> {
        var interval = Flux.interval(Duration.ofSeconds(1))

        var event: Flux<String> = Flux.fromStream(Stream.generate { "test stream" })

        return Flux.zip(interval, event).map { it.t2 } as Flux<String>
    }

}