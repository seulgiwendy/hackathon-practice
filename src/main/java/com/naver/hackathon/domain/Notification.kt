package com.naver.hackathon.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class Notification(

        @field:JsonProperty("read")
        var read: Boolean = false,

        @field:JsonProperty("articleTitle")
        var title: String? = null,

        @field:JsonProperty("type")
        var type: NotificationTypes = NotificationTypes.NEW)