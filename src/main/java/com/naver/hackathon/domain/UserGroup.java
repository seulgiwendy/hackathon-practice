package com.naver.hackathon.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
public enum UserGroup {

    GROUP_A("A"),
    GROUP_B("B"),
    GROUP_C("C");

    @JsonValue
    private String symbol;

    UserGroup(String symbol) {
        this.symbol = symbol;
    }

}
