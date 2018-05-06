package com.naver.hackathon.domain;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class NewArticleEvent extends ApplicationEvent {

    private Set<UserGroup> targetGroups;
    private String title;
    private LocalDateTime time;
    private long id;

    private NewArticleEvent(Set<UserGroup> targetGroups, String title, long id, LocalDateTime time) {
        super(title);
        this.targetGroups = targetGroups;
        this.title = title;
        this.id = id;
        this.time = time;
    }

    public static NewArticleEvent ofArticle(Article article) {
        return new NewArticleEvent(article.getTargetGroup(), article.getTitle(), article.getId(), article.getCreatedTime());
    }
}
