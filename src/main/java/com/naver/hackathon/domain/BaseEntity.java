package com.naver.hackathon.domain;

import lombok.Getter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

@MappedSuperclass
@Getter
public class BaseEntity {

    @Transient
    private static final String TIME_STRING_FORMAT = "yyyy.MM.dd";

    @CreatedDate
    private LocalDateTime createdTime;

    @UpdateTimestamp
    private LocalDateTime updatedTime;


    public String getCreatedTimeString() {
        return getFormattedTime(this.createdTime);
    }

    public String getUpdatedTimeString() {
        return getFormattedTime(this.updatedTime);
    }

    private String getFormattedTime(TemporalAccessor time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TIME_STRING_FORMAT);

        return formatter.format(time);
    }
}
