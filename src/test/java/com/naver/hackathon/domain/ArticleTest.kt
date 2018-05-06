package com.naver.hackathon.domain

import com.naver.hackathon.domain.repositories.ArticleRepository
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
@ActiveProfiles("local-test")
class ArticleTest {

    @Autowired
    lateinit var articleRepository: ArticleRepository

    private val article = Article(title = "김준현 설렁탕 특으로 먹는다")

    @Test
    fun article_isCorrectlySavingProperty() {
        assertThat(this.article.title, `is`("김준현 설렁탕 특으로 먹는다"))
    }

    @Test
    fun article_isPublishingDomainEvent() {
        articleRepository.save(this.article)
    }

}