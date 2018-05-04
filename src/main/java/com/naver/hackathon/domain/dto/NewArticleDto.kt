package com.naver.hackathon.domain.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.naver.hackathon.domain.Article
import com.naver.hackathon.domain.UserGroup

data class NewArticleDto(

        @field:JsonProperty("title")
        val title: String = "제목 없음",

        @field:JsonProperty("content")
        val content: String? = null,

        @field:JsonProperty("groups")
        val targetGroups: MutableSet<UserGroup>? = null) {

    fun toEntity(): Article {
        return Article(title = this.title, content = this.content, targetGroup = this.targetGroups)
    }
}