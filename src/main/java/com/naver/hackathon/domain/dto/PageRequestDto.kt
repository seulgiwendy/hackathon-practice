package com.naver.hackathon.domain.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.naver.hackathon.domain.UserGroup

data class PageRequestDto(
        @field:JsonProperty("groups")
        val groups: MutableSet<UserGroup>? = null,

        @field:JsonProperty("page")
        val page: Int? = 1) {

}