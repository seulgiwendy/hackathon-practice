package com.naver.hackathon.domain

import org.springframework.data.domain.DomainEvents
import javax.persistence.*

@Entity
data class Article(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ARTICLE_ID")
        var id: Long? = null,

        @Column(name = "ARTICLE_TITLE")
        var title: String? = null,

        @Column(name = "ARTICLE_CONTENT", columnDefinition = "TEXT NULL")
        var content: String? = null,

        @Enumerated(value = EnumType.STRING)
        @ElementCollection(targetClass = UserGroup::class)
        @CollectionTable(name = "ARTICLE_TARGETGROUPS")
        var targetGroup: MutableSet<UserGroup>? = null) : BaseEntity() {

    @DomainEvents
    fun newArticleEvent() : NewArticleEvent {
        return NewArticleEvent.ofArticle(this)
    }
}