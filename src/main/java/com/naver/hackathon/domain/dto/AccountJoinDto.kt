package com.naver.hackathon.domain.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.naver.hackathon.domain.Account
import com.naver.hackathon.domain.UserGroup

data class AccountJoinDto(

        @field:JsonProperty("accountId")
        val id: String? = null,

        @field:JsonProperty("password")
        val password: String? = null,

        @field:JsonProperty("group")
        val groups: MutableSet<UserGroup>? = null) {

    fun generateModel(): Account {
        return Account(userId = this.id, password = this.password, groups = this.groups)
    }
}