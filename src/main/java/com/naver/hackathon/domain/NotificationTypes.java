package com.naver.hackathon.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum NotificationTypes {
    NEW("새로운 글이 등록되었습니다: "),
    MODIFIED("공지사항이 수정되었습니다: ");

    private String caption;

    NotificationTypes(String caption) {
        this.caption = caption;
    }

    public String getType() {
        return this.name();
    }
}
