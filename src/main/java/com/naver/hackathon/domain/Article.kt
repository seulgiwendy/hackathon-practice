package com.naver.hackathon.domain

import javax.persistence.*

@Entity
data class Article(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ARTICLE_ID")
        var id: Long? = null,

        @Column(name = "ARTICLE_TITLE")
        var title: String? = null,

        @Column(name = "ARTICLE_CONTENT", columnDefinition = "TEXT NOT NULL")
        var content: String? = null,

        @Enumerated(value = EnumType.STRING)
        var targetGroup: UserGroup? = null)