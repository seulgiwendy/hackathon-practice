package com.naver.hackathon.domain

import javax.persistence.*

@Entity
data class Account(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ACCOUNT_UID")
        var id: Int? = null,

        @Column(name = "ACCOUNT_USERID")
        var userId: String? = null,

        @Column(name = "ACCOUNT_PASSWORD")
        var password: String? = null,

        @Column(name = "ACCOUNT_GROUPS")
        @ElementCollection(targetClass = UserGroup::class)
        @CollectionTable(name = "ACCOUNT_GROUP_REL")
        @Enumerated(value = EnumType.STRING)
        var groups: Set<UserGroup> = emptySet())