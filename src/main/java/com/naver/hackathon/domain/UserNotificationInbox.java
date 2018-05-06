package com.naver.hackathon.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class UserNotificationInbox {

    @Id
    private long userId;

    private List<UserGroup> targetGroups;
    private List<Notification> notifications;

    @JsonProperty("new")
    public long getNewNotificationsCount() {
        return notifications.stream().filter(n -> !n.getRead()).count();
    }

}
