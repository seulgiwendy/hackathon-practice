package com.naver.hackathon.service.event.publisher;

import com.naver.hackathon.domain.NewArticleEvent;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ArticleEventPublisher {

    private static final Logger log = LoggerFactory.getLogger(ArticleEventPublisher.class);

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishArticleEvent(NewArticleEvent event) {
        log.info("publish new article event for article title : {}", event.getTitle());

        applicationEventPublisher.publishEvent(event);
    }

}
