package com.naver.hackathon.domain.eventhandler;

import com.naver.hackathon.domain.NewArticleEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class NewArticleEventHandler implements ApplicationListener<NewArticleEvent>{

    private static final Logger log = LoggerFactory.getLogger(NewArticleEventHandler.class);

    @Override
    public void onApplicationEvent(NewArticleEvent newArticleEvent) {
        log.error("{}, {}", newArticleEvent.getTitle(), newArticleEvent.getId());
    }
}
